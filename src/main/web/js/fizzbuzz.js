
function FizzBuzzViewModel() {

    var self = this;
    self.from = ko.observable(1);
    self.to = ko.observable(20);
    self.result = ko.observable("");
    self.report = ko.observable("");

    self.execute = function() {
        axios.get('http://localhost:8080/fizzbuzz/from/' + self.from() + '/to/' +  self.to())
            .then((response) => {
                console.log(response.data);
                console.log(response.status);
                var res = response.data.split("\n");
                if (res.length > 0) {
                    self.result(res[0]);
                    self.report(res[1]);
                } else {
                    self.result("");
                    self.report("");
                }

            })
            .catch(error => {
                console.log(error);
            });
    };

}

ko.applyBindings(new FizzBuzzViewModel());