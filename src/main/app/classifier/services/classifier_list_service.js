var module = require('main_module');


function Service ($http){

    this.analyse=function(analysisPrameters){
         return $http.post('/api/analysis',params);
    }

}


Service.$inject = ['$http'];
module.service('ClassifierListService', Service);