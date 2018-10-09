def chop(key, array):
    if array is None or len(array) == 0:
        return -1
    length = len(array)
    left = 0
    right = length - 1
    while left <= right:
        index = (left + right) // 2
        if array[index] == key:
            return index
        elif array[index] < key:
            left = index + 1
        else:
            right = index - 1
    return -1
