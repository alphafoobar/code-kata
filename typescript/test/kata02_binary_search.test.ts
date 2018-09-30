'use strict';

import Search from '../src/kata02_binary_search';

const search = new Search();

test('Empty list handled', () => {
    expect.assertions(1);
    return expect(search.chop(3, [])).resolves.toEqual(-1);
});

test('Single item lists', () => {
    expect.assertions(2);
    expect(search.chop(3, [1])).resolves.toEqual(-1);
    return expect(search.chop(1, [1])).resolves.toEqual(0);
});

test('Lists of 3', () => {
    expect.assertions(7);
    expect(search.chop(1, [1, 3, 5])).resolves.toEqual(0);
    expect(search.chop(3, [1, 3, 5])).resolves.toEqual(1);
    expect(search.chop(5, [1, 3, 5])).resolves.toEqual(2);
    expect(search.chop(0, [1, 3, 5])).resolves.toEqual(-1);
    expect(search.chop(2, [1, 3, 5])).resolves.toEqual(-1);
    expect(search.chop(4, [1, 3, 5])).resolves.toEqual(-1);
    return expect(search.chop(6, [1, 3, 5])).resolves.toEqual(-1);
});

test('Lists of 4', () => {
    expect.assertions(9);
    expect(search.chop(1, [1, 3, 5, 7])).resolves.toEqual(0);
    expect(search.chop(3, [1, 3, 5, 7])).resolves.toEqual(1);
    expect(search.chop(5, [1, 3, 5, 7])).resolves.toEqual(2);
    expect(search.chop(7, [1, 3, 5, 7])).resolves.toEqual(3);
    expect(search.chop(0, [1, 3, 5, 7])).resolves.toEqual(-1);
    expect(search.chop(2, [1, 3, 5, 7])).resolves.toEqual(-1);
    expect(search.chop(4, [1, 3, 5, 7])).resolves.toEqual(-1);
    expect(search.chop(6, [1, 3, 5, 7])).resolves.toEqual(-1);
    return expect(search.chop(8, [1, 3, 5, 7])).resolves.toEqual(-1);
});
