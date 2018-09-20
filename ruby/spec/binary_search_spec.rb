require_relative '../lib/binary_search'
require 'rspec'

describe 'Binary search chop' do

    it 'should find the key or return -1' do
        binary_search = BinarySearch.new
        expect(binary_search.chop(3, [])).to eq -1
        expect(binary_search.chop(3, [1])).to eq -1
        expect(binary_search.chop(1, [1])).to eq 0
        #
        expect(binary_search.chop(1, [1, 3, 5])).to eq 0
        expect(binary_search.chop(3, [1, 3, 5])).to eq 1
        expect(binary_search.chop(5, [1, 3, 5])).to eq 2
        expect(binary_search.chop(0, [1, 3, 5])).to eq -1
        expect(binary_search.chop(2, [1, 3, 5])).to eq -1
        expect(binary_search.chop(4, [1, 3, 5])).to eq -1
        expect(binary_search.chop(6, [1, 3, 5])).to eq -1
        #
        expect(binary_search.chop(1, [1, 3, 5, 7])).to eq 0
        expect(binary_search.chop(3, [1, 3, 5, 7])).to eq 1
        expect(binary_search.chop(5, [1, 3, 5, 7])).to eq 2
        expect(binary_search.chop(7, [1, 3, 5, 7])).to eq 3
        expect(binary_search.chop(0, [1, 3, 5, 7])).to eq -1
        expect(binary_search.chop(2, [1, 3, 5, 7])).to eq -1
        expect(binary_search.chop(4, [1, 3, 5, 7])).to eq -1
        expect(binary_search.chop(6, [1, 3, 5, 7])).to eq -1
        expect(binary_search.chop(8, [1, 3, 5, 7])).to eq -1
    end
end
