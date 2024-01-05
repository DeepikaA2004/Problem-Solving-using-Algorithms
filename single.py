from math import factorial

def calculate_groups_and_permutations(speeds):
    speeds.sort()  # Sort speeds in ascending order
    groups = 1
    prev_speed = speeds[0]
    current_group_size = 1

    for speed in speeds[1:]:
        if speed == prev_speed + 1:
            current_group_size += 1
        else:
            groups *= factorial(current_group_size)
            current_group_size = 1

        prev_speed = speed

    groups *= factorial(current_group_size)

    total_permutations = factorial(len(speeds))
    result = groups / total_permutations

    return round(result, 6)

# Read input
N = int(input())
speeds = list(map(int, input().split()))

# Calculate and print the result
result = calculate_groups_and_permutations(speeds)
print(result)