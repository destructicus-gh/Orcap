var routerApp = angular.module('orcap', ['ui.router', 'ngAnimate', 'permission', 'permission.ui']);

routerApp.run(function (PermissionStore) {
    PermissionStore
        .definePermission('permissionA', function () {
            return false;
        });
});

routerApp.config(function ($stateProvider, $urlRouterProvider) {
    console.log("this ran");

    $urlRouterProvider.otherwise(function ($injector) {
        var $state = $injector.get("$state");
        $state.go('login', {message: "you can't go there"});
    });
    $stateProvider
        .state('home', {
            url: '/home',
            templateUrl: 'views/home.html',
            data: {
                permissions: {
                    only: 'permissionA',
                    redirectTo: {
                        default: {
                            state: 'login',
                            params: {
                                message: 'Must Log in, Thanks.'
                            }
                        }
                    }
                }
            }
        })
        .state('login', {
            url: '/login',
            controller: 'LoginController',
            controllerAs: "ctrl",
            params: {
                message: ""
            },
            templateUrl: 'views/login.html'
        });

});
