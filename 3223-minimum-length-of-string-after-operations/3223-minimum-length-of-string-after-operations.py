class Solution:
    def minimumLength(self, s: str) -> int:
        c = Counter(s)
        length =0
        for char, count in c.items():
            if count % 2:
                length+=1
            else:
                length+=2
        return length

        