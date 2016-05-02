class taskA {
    def static run(Object inputObject, PrintStream out, bar) {
        (1..10).each {
            bar.setValue(it*10)
            out.print "For input " + it
            Object ret = inputObject.invokeMethod("runTask", it)
            if (ret == null) {
                out.println ", program returns null"
            } else {
                out.print ", program returns " + ret
                out.println ": " + ((ret == it + 1) ? "correct" : "incorrect")
            }
        }
        "done"
    }
}