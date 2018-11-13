'use strict';

const {hashOne, hashTwo, hashThree} = require('../../src/kata05/bloom-filters');

test('hash one', () => {
    expect.assertions(1);
    return expect(hashOne("test", 10)).resolves.toEqual(-1);
});

test('hash two', () => {
    expect.assertions(1);
    return expect(hashTwo("test", 10)).resolves.toEqual(-1);
});

test('hash three', () => {
    expect.assertions(1);
    return expect(hashThree("test", 10)).resolves.toEqual(-1);
});
