class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        matched = []
        for index1, word1 in enumerate(words):
            for index2, word2 in enumerate(words):
                if index1 != index2:
                    if word1 in word2:
                        matched.append(word1)
                        break
        return matched
        