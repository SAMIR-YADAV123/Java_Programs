// var myglobal=10;
// function fun1(){
//     oopsglobal=5;
// }

// function fun2(){
//     var output="";
//     if(typeof myglobal !="undefined"){ 
//         output+="myglobal:"+myglobal;
//     }
// //    console.log("\n")
//     if(typeof oopsglobal !="undefined")
//       output+="oopsglobal:"+oopsglobal
 
//       console.log(output)

//     }

// fun1()
// fun2()

// var a=[1,6,8,95,5,7]
// console.log("A = ",JSON.stringify(a))
// console.log("A =",a)

// function fun1(val,x){
//     if(val == x)
//       return "equal to the given number"
//     else
//       return "not equal to the given number"

// }
// console.log(fun1(5,"5"))

// var myobject = {
//     name:"suman",
//     legs:3,
//     tails:2
// }

// console.log(myobject.name)
// console.log(myobject.legs)
// console.log(myobject["name"])
// console.log(myobject["legs"])

// function checkobj(x){
//     if(myobject.hasOwnProperty(x))
//       return myobject[x]
//     else
//       return "not found"  
// }
// console.log(checkobj("tails"))
// myobject.name="samir"
// console.log(myobject["name"])

// myobject.relation="friend"
// console.log(myobject["relation"])

// delete myobject.tails
// console.log(myobject["tails"])


// var mymusic=[
//     {
//         "artist":"Arijit singh",
//         "title":"singer",
//         "release_year":2015,
//         "formats":[
//             "CS",
//             "8T",
//             "LP"
//         ],
//         "gold":true
//     },
//     {
//         name:"samir",
//         regno:40111119
//     }
// ];
// console.log(mymusic)
var collection={
    "2548":{
        "album":"Slippery when wet",
        "artist":"bon jovi",
        "tracks":[
            "Let it rock",
            "you give love a bad name"
        ]
    },
    "2468":{
        "album":"1999",
        "artist":"prince",
        "tracks":[
            "1999",
            "Little red corvette"
        ]
    },
    "1245":{
        "artist":"robert palmer",
        "tracks":[]
    },
    "5439":{
        "album":"ABBA Gold"
    }
};

// var collectionCopy=JSON.parse(JSON.stringify(collection))

// function updateRecord(id,prop,value){
//    if(value === ""){
//        delete collection[id][prop];
//     }
//     else if(prop==="track"){
//         collection[id][prop]=collection[id][prop] || []
//         collection[id][prop].push(value);
//     }
//     else
//      collection[id][prop]=value
   
//     return collection;
// }
// updateRecord(2468,"tracks","test")
// console.log(updateRecord(5439,"artist","ABBA"))

// var numberbtwn0and19=Math.floor(Math.random() * 20);

// function randomWhole(){
//     return Math.floor(Math.random() *10);
// }
// console.log(randomWhole())
// console.log(numberbtwn0and19)
// var str="45"
// console.log(parseInt(str))

// const s=[2,5,7]
// function change(){
//     "use restrict";
//     s[0]=4;
//     s[1]=6;
//     s[2]=9;
// }
// change()
// console.log(s)
// s.push(4)
// console.log(s)

// function freezeobj(){
//     "use restrict";
//     const MATH_CONSTANTS={
//        PI:3.14
//     };
// // MATH_CONSTANTS.freeze(PI)
//     try{
//         MATH_CONSTANTS.PI=12
//     }catch(x){
//         console.log(x);
//     }

//     console.log(MATH_CONSTANTS.PI)
// }

// freezeobj()
// console.log(freezeobj())


// var concatt = (arr1,arr2) => arr1.concat(arr2);

// console.log(concatt([1,2,3],[6,7,8,9]))

// const [z,x,,y]=[1,2,3,4,5,6];
// console.log(z,x,y)
// let a=6,b=4;
// (
//     ()=>{
//         "use strict"
//         [a,b]=[b,a]
//     })();
    
// console.log(a)
// console.log(b)

const stats={
    max:23.56,
    min:1.34,
    name:"samir"
}

const half=(function(){
    return function half({max,min}){
    return (max+min)/2;
    };
})();

console.log(stats)
console.log(half(stats))
