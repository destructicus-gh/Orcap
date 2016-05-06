var routerApp = angular.module('orcap', ['ui.router', 'ngAnimate']);

routerApp.config(function ($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/home');
    $stateProvider
        .state('home', {
            url: '/home',
            templateUrl: 'views/partial-home.html'
        })
        .state('login', {
            url: '/login',
            templateUrl: 'views/login.html'
        });

});
