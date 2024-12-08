function palindrome(str){
    let str1=str.toLowerCase().replace(/[^a-z0-9]/g, '');
    let str2=str1.split('').reverse().join('');
   return(str1== str2);

}
console.log(palindrome("Complete the project report"));