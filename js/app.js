var routerApp = angular.module('orcap', ['ui.router', 'ngAnimate']);

routerApp.config(function ($stateProvider, $urlRouterProvider) {
    console.log("this ran");
    $urlRouterProvider.otherwise('/home');
    $stateProvider
        .state('home', {
            url: '/home',
            templateUrl: 'views/home.html'
        })
        .state('login', {
            url: '/login',
            templateUrl: 'views/login.html'
        });

});
