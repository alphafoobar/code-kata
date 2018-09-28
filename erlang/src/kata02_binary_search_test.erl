-module(kata02_binary_search_test).

-include_lib("eunit/include/eunit.hrl").

empty_list_test() ->
  ?assertEqual(-1, kata02_binary_search:chop(1, [])).

single_item_list_test() ->
  [?assertEqual(-1, kata02_binary_search:chop(3, [1])),
    ?assertEqual(0, kata02_binary_search:chop(1, [1]))].

triple_item_list_test() ->
  [?assertEqual(0, kata02_binary_search:chop(1, [1,3,5])),
    ?assertEqual(1, kata02_binary_search:chop(3, [1,3,5])),
    ?assertEqual(2, kata02_binary_search:chop(5, [1,3,5])),
    ?assertEqual(-1, kata02_binary_search:chop(0, [1,3,5])),
    ?assertEqual(-1, kata02_binary_search:chop(2, [1,3,5])),
    ?assertEqual(-1, kata02_binary_search:chop(4, [1,3,5])),
    ?assertEqual(-1, kata02_binary_search:chop(6, [1,3,5]))].

quadruple_item_list_test() ->
  [?assertEqual(0, kata02_binary_search:chop(1, [1,3,5,7])),
    ?assertEqual(1, kata02_binary_search:chop(3, [1,3,5,7])),
    ?assertEqual(2, kata02_binary_search:chop(5, [1,3,5,7])),
    ?assertEqual(3, kata02_binary_search:chop(7, [1,3,5,7])),
    ?assertEqual(-1, kata02_binary_search:chop(0, [1,3,5,7])),
    ?assertEqual(-1, kata02_binary_search:chop(2, [1,3,5,7])),
    ?assertEqual(-1, kata02_binary_search:chop(4, [1,3,5,7])),
    ?assertEqual(-1, kata02_binary_search:chop(6, [1,3,5,7])),
    ?assertEqual(-1, kata02_binary_search:chop(8, [1,3,5,7]))].
