let str = "This is a sunny day";

let strReverse = "";

for (let word of str.split(" ")) {
  let temp = "";
  for (let i = word.length; i >= 0; i--) {
    temp = temp.concat(word.charAt(i));
  }
  strReverse = strReverse + " " + temp;
}

console.log(strReverse.trim());
