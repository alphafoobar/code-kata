package go_lang

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestEmptyArray(t *testing.T) {
	var ints []int
	AssertFind(t, -1, 3, ints)
}

func TestSingleItemArray(t *testing.T) {
	ints := []int{1}
	AssertFind(t, -1, 3, ints)
	AssertFind(t, 0, 1, ints)
}

func TestThreeItemArray(t *testing.T) {
	ints := []int{1, 3, 5}
	AssertFind(t, 0, 1, ints)
	AssertFind(t, 1, 3, ints)
	AssertFind(t, 2, 5, ints)
	AssertFind(t, -1, 0, ints)
	AssertFind(t, -1, 2, ints)
	AssertFind(t, -1, 4, ints)
	AssertFind(t, -1, 6, ints)
}

func TestFourItemArray(t *testing.T) {
	ints := []int{1, 3, 5, 7}
	AssertFind(t, 0, 1, ints)
	AssertFind(t, 1, 3, ints)
	AssertFind(t, 2, 5, ints)
	AssertFind(t, 3, 7, ints)
	AssertFind(t, -1, 0, ints)
	AssertFind(t, -1, 2, ints)
	AssertFind(t, -1, 4, ints)
	AssertFind(t, -1, 6, ints)
	AssertFind(t, -1, 8, ints)
}

func AssertFind(t *testing.T, expected int, key int, ints []int) {
	result, err := chop(key, ints)
	assert.Nil(t, err)
	assert.Equal(t, expected, result)
}
