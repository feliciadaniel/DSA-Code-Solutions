class Solution:
    def wordSubsets(self, words1: List[str], words2: List[str]) -> List[str]:
        counter_words2 = [Counter(w) for w in words2]
        counter_max = Counter()
        for word in counter_words2:
            for c , w in word.items():
                counter_max[c] = max(counter_max[c],w)
        res = []
        for word in words1:
            counter_words1 = Counter(word)
            flag = True
            for char, count in counter_max.items():
                if counter_words1[char] < count:
                    flag = False
                    break
            if flag == True:
                res.append(word)
        return res


        