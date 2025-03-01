class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        count = [0]
        self.recursiveFunc(flowerbed, 0, count)
        return count[0] >= n

    def recursiveFunc(self, flowerbed: List[int], prev: int, count: List[int]):
        if not flowerbed:
            return
        
        # Check the current spot
        if flowerbed[0] == 0:
            # If the previous spot is empty and the next spot is also empty (or no next spot exists)
            if prev == 0 and (len(flowerbed) == 1 or flowerbed[1] == 0):
                count[0] += 1
                # Skip the next element because we placed a flower here
                self.recursiveFunc(flowerbed[2:], 0, count)
                return
            # If we can't place a flower, just skip to the next spot
            else:
                self.recursiveFunc(flowerbed[1:], flowerbed[0], count)
        else:
            # If the current spot is not empty, just skip it and go to the next spot
            self.recursiveFunc(flowerbed[1:], flowerbed[0], count)

