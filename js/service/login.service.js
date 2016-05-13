/**
 * Created by a689638 on 5/13/2016.
 */
angular.module('orcap').service(
    'LoginService', ['$http', function($http){
        var loginService = this;
        var url = "http://localhost:8080/user";
        //var url = "http://diygradle-destructicus.rhcloud.com/user";
        loginService.sessionid = null;
        function success(raw){return raw.data;}
        function saveSessionId(user){
            loginService.sessionid = user.sessionId;
            return user.data;
        }

        //Login, save user session
        this.login = function(username, password){
            return $http.post("/login", {username:username, password:password})
                .then(success)
                .then(saveSessionId)
        }
    }]
);