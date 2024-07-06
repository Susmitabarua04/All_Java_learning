#include <stdio.h>
#include <stdbool.h>
#include <math.h>

// Function to check if a number is prime
bool isPrime(int num) {
    if (num <= 1) {
        return false;
    }

    for (int i = 2; i <= sqrt(num); ++i) {
        if (num % i == 0) {
            return false;
        }
    }

    return true;
}

// Function to check if a number is left-truncatable prime
bool isLeftTruncatablePrime(int num) {
    // Convert the number to a string to easily truncate digits
    char strNum[10];
    sprintf(strNum, "%d", num);

    // Check left truncatable property
    for (int i = 0; strNum[i] != '\0'; ++i) {
        int truncatedNum = atoi(&strNum[i]);
        if (!isPrime(truncatedNum)) {
            return false;
        }
    }

    return true;
}

// Function to check if a number is right-truncatable prime
bool isRightTruncatablePrime(int num) {
    int temp = num;
    while (temp > 0) {
        if (!isPrime(temp)) {
            return false;
        }
        temp /= 10;
    }

    return true;
}

int main() {
    int n = 8; // Change n to the desired value (8 <= n <= 11)
    int count = 0;
    int sum = 0;
    int num = 10;

    while (count < n) {
        if (isLeftTruncatablePrime(num) && isRightTruncatablePrime(num)) {
            sum += num;
            count++;
        }
        num++;
    }

    printf("Sum of the first %d primes that are both left and right truncatable: %d\n", n, sum);

    return 0;
}
