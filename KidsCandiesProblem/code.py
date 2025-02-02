class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxCandies = max(candies)

        return [CurNum + extraCandies >= maxCandies for CurNum in candies]