// // var John = {
// //     mass: 90,
// //     height: 2,
// //     calcBMI: function() {
// //         this.bmi = this.mass / (this.height * this.height);
// //         return this.bmi;
// //     }
// // }

// // var Mark = {
// //     mass: 80,
// //     height: 3,
// //     calcBMI: function() {
// //         this.bmi = this.mass / (this.height * this.height);
// //         return this.bmi;
// //     }
// // }

// // var bool = Mark.calcBMI() > John.calcBMI();
// // console.log("Is Mark's BMI higher than John's? " + bool);

// JohnAVG = (89 + 120 + 103)/3;
// MikeAVG = (116 + 94 + 123)/3;

// JohnAVG > MikeAVG ? console.log("John's team wins") : console.log("Mike's team wins");


var bills = [124, 48, 268]
bills.forEach(element => {
    if (element <= 50) return 10;
    else if (element >= 100) return 15;
    else return 20; 
)};