/**
 * Created by a689638 on 5/13/2016.
 */
angular.module('orcap').controller(
    'LoginController', ['LoginService', '$http','$state', '$stateParams', function(LoginService, $http, $state, $stateParams){
        var vm = this;
        vm.message = $stateParams.message;
        vm.login = function(username, password){
            LoginService.l
        }
    }]
);