-module(kata02_binary_search).

%% API
-export([chop/2]).

chop(Key, Array) ->
  Length = length(Array),
  if
    Length == 0 -> -1;
    true ->
      Mid = length_div_2(Length),
      Item = lists:nth(Mid, Array),
      if
        Item == Key -> Mid - 1;
        (Length > 1) and (Item > Key) -> chop(Key, lists:sublist(Array, 1, Mid-1));
        (Length > 1) and (Item < Key) ->
          Chop = chop(Key, lists:sublist(Array, Mid + 1, Length)),
          if
            Chop == -1 -> -1;
            true -> Mid + Chop
          end;
        true -> -1
      end
  end.

length_div_2(Length) -> (Length div 2) + 1.


