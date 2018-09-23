'use strict';

const chop = require('../src/kata02-binary-search');

test('Empty list handled', () => {
    expect.assertions(1);
    return expect(chop(3, [])).resolves.toEqual(-1);
});

test('single item lists', () => {
    expect.assertions(2);
    expect(chop(3, [1])).resolves.toEqual(-1);
    return expect(chop(1, [1])).resolves.toEqual(0);
});

test('Lists of 3', () => {
    expect.assertions(1);
    expect(chop(1, [1, 3, 5])).resolves.toEqual(0);
    expect(chop(3, [1, 3, 5])).resolves.toEqual(1);
    expect(chop(5, [1, 3, 5])).resolves.toEqual(2);
    expect(chop(0, [1, 3, 5])).resolves.toEqual(-1);
    expect(chop(2, [1, 3, 5])).resolves.toEqual(-1);
    expect(chop(4, [1, 3, 5])).resolves.toEqual(-1);
    return expect(chop(6, [1, 3, 5])).resolves.toEqual(-1);
});

test('Lists of 4', () => {
    expect.assertions(1);
    expect(chop(1, [1, 3, 5, 7])).resolves.toEqual(0);
    expect(chop(3, [1, 3, 5, 7])).resolves.toEqual(1);
    expect(chop(5, [1, 3, 5, 7])).resolves.toEqual(2);
    expect(chop(7, [1, 3, 5, 7])).resolves.toEqual(3);
    expect(chop(0, [1, 3, 5, 7])).resolves.toEqual(-1);
    expect(chop(2, [1, 3, 5, 7])).resolves.toEqual(-1);
    expect(chop(4, [1, 3, 5, 7])).resolves.toEqual(-1);
    expect(chop(6, [1, 3, 5, 7])).resolves.toEqual(-1);
    expect(chop(8, [1, 3, 5, 7])).resolves.toEqual(-1);
});
