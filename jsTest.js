function solution(want, number, discount) {
  var answer = 0;
  let cart = [];
  let cartNumber = [];
  let discountList = [...discount];
  const equals = (a, b) => a.every((v, i) => v >= b[i]); 

  for(let z = 0; z < discount.length; z ++) {
      // discountList.forEach((item, i) => {
      //     if(i < 10) {
      //         for(let j = 0; j < want.length; j++) {
      //             if(item == want[j]) cart.push(item);
      //         };
      //     };
      // });

      let endDiscount = 0;
      if (z + 10 <= discount.length) {
        // 10개를 세려면 9개를 더해야함.
        endDiscount = z + 10
      } else {
        endDiscount = discount.length
      }

      console.log(z + " endDiscount : " + endDiscount)

      let cart = discountList.slice(z, endDiscount)


      console.log(z + "일차 : " + cart)
  
      want.map((item, i) => {
          cartNumber.push(cart.filter(cartItem => cartItem === item).length);
      });
      
      equals(cartNumber, number) === true ? answer ++ : null;
      discountList.shift();
      cart = [];
      cartNumber = [];
  };

  console.log(answer)

  return answer;
}

solution(["banana", "apple", "rice", "pork", "pot"], [3, 2, 2, 2, 1], ["chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"]);