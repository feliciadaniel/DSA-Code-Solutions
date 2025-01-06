class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        num = len(boxes)
        operation = [0] * num
        forward_pass  = 0
        for i in range(1,num):
            if boxes[i-1] == '1':
                forward_pass += 1
            operation[i] = operation[i-1]+forward_pass
        backward_pass = 0
        sum_operation = 0
        for i in range(num-2,-1,-1):
            if boxes[i+1] == '1':
                backward_pass += 1
            sum_operation += backward_pass
            operation[i] += sum_operation
        return operation


        