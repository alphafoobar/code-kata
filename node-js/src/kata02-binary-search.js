'use strict';

/**
 * Solution 1.
 * Recursively seeks the key, slices arrays and requires an offset to remain true.
 */
const chopWorker = (key, array, offset) => {
    if (array.length === 0) {
        return -1;
    }
    if (array.length === 1 && array[0] !== key) {
        return -1;
    }
    const midPoint = Math.min(array.length - 1, Math.floor(array.length / 2));
    if (array[midPoint] === key) {
        return offset + midPoint;
    }
    if (array[midPoint] > key) {
        return chopWorker(key, array.slice(0, midPoint), offset);
    }
    return chopWorker(key, array.slice(midPoint + 1, array.length), offset + midPoint + 1);
};

const chop1 = (key, array) => {
    return Promise.resolve(chopWorker(key, array, 0));
};

module.exports = chop1;
