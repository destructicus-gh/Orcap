package service
import gui.OverclockedOrca
import model.MenuOption
import model.QuizOption
import model.TaskOption
import model.TreeOption

import javax.swing.event.ListSelectionEvent
import javax.swing.event.TreeSelectionEvent
import javax.swing.event.TreeSelectionListener
import javax.swing.tree.DefaultMutableTreeNode
/**
 * Created by a689638 on 3/23/2016.
 * Copyright (C) 2016 HEB
 * @author Ryan Anders
 * This software is the confidential and proprietary information 
 * of HEB
 */
def static LoadOptions(DefaultMutableTreeNode top) {
    top.add(loadQuiz());
    top.add(loadTasks());
}

def static loadQuiz() {
    def quiz = new DefaultMutableTreeNode("Quizzes")
    def test1 = new DefaultMutableTreeNode(new QuizOption("Test 1"))
    quiz.add test1
    quiz
}


def static loadTasks(){
    def task = new DefaultMutableTreeNode("Tasks")
    def task1 = new DefaultMutableTreeNode(new TaskOption("Task 1"))
    task.add task1
    task

}
def static TreeSelectionListener getTreeListener() {
    TreeSelectionListener ts = new TreeSelectionListener() {
        @Override
        void valueChanged(TreeSelectionEvent e) {
            println e
            println e.getNewLeadSelectionPath()
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) e.getNewLeadSelectionPath().getLastPathComponent();

            if (node == null)
            //Nothing is selected.
                return;

            Object nodeInfo = node.getUserObject();
            if (node.isLeaf()) {
                ((TreeOption) nodeInfo).select(e)
            } else {
                println "not a leaf"
            }
        }
    }
    ts
}

def static optionSelect(ListSelectionEvent e) {
    println e
    MenuOption m = OverclockedOrca.getSelf().getListModel().get e.getLastIndex()
    if (!e.valueIsAdjusting) OverclockedOrca.setCurrent m
}

