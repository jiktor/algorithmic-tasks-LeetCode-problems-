#First solution
class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        result = []
        i,j = 0, 0

        while i < len(word1) and j < len(word2):
            result.append(word1[i])
            result.append(word2[j])
            i += 1
            j +=1
        result.append(word1[i:])
        result.append(word2[j:])

        return "".join(result)
#Second solution
class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        # If word2 is empty, return word1
        if len(word2) == 0:
            return word1
        
        result = ""  # Initialize an empty string to store the result

        # If word1 is longer than word2
        if len(word1) > len(word2):
            for i in range(len(word2)):  # Iterate until the length of the shorter string
                result += word1[i]  # Add character from word1
                result += word2[i]  # Add character from word2
            result += word1[len(word2):]  # Add the remaining part of word1 (if any)
        
        # If word2 is longer than word1
        elif len(word1) < len(word2):
            for i in range(len(word1)):  # Iterate until the length of the shorter string
                result += word1[i]  # Add character from word1
                result += word2[i]  # Add character from word2
            result += word2[len(word1):]  # Add the remaining part of word2 (if any)

        # If both words have the same length
        else:
            for i in range(len(word1)):  # Iterate through both strings
                result += word1[i]
                result += word2[i]

        return result  # Return the merged result