function solution(k, score) {
  let box = [];
  var answer = [];

  // [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
  for(let i = 0; i < score.length; i++) {
    if(box.length < k) {
      box.push(score[i]);
      let min = Math.min(...box);
      box.sort();
      answer.push(min);
    } else {
      let min = Math.min(...box);
      if(min < score[i]) {
        const duplicatesNum = box.filter(num => min === num);
        if(duplicatesNum.length > 1) {
          let set = new Set(box);
          set = [...set];
          if(set.length === box.length){
            box = box.filter(num => min !== num);
            box.push(score[i]);
          } else {
            box = [...set];
            box.push(score[i]); 
          }
        } else {
          box = box.filter(num => min !== num);
          box.push(score[i]);
        }
      }
      min = Math.min(...box);
      answer.push(min);
    }
  }

  return answer;
} 

console.log(solution(4, [0, 300, 40, 300, 20, 70, 300, 300, 300, 1000]))