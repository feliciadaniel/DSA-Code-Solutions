class Solution:
    def maxScore(self, s: str) -> int:
        score = (s[0] == '0')+s[1:].count('1')
        max_score = score
        for i in range(1,len(s)-1):
            if s[i] == '0':
                score+=1
            else:
                score-=1
            max_score = max(max_score,score)
        return max_score
        