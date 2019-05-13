#pragma once

#include "common.h"

int* createArray(int size);
void printArray(int arr[], int size);
int swap(int arr[], int index1, int index2);
int* shuffleArray(int arr[], int size);
int* fillArray(int arr[], int size);
int partition(int arr[], int first, int last, int pivot);
void matchKeysWithLocks(int key[], int lock[], int first, int last);
