const solution = (N) => {
    // chuyển đổi số N -> mã số nhị phân
    let binaryString = "";
    while (N > 0) {
        binaryString = (N % 2) + binaryString;
        N = Math.floor(N / 2);
    }

    const binaryArray = binaryString.split('')
    let i = 0, j = 0;
    let maxDistance = 0
    for(i, j ; i < binaryArray.length; i++){
        if(binaryArray[i] == 1 && binaryArray[j] == 1){
            if(maxDistance < i - j - 1){
                maxDistance = i - j - 1
            }
            j = i
        }
    }
    return maxDistance
}

console.log(solution(32)); // 10000 -> result = 0
console.log(solution(529)); // 1000010001 -> result = 4
console.log(solution(9)); // 1001 -> result = 2
console.log(solution(33)); // 100001 -> reesult = 4
