-module(tasks).

-export([list_filter/0]).
-export([pattern_match/0]).

% This function just gets the input from the user and passes it to the filter application function.
list_filter() -> 
    io:format("Here's a list of numbers 1 through 100. Pick a number that you want to find multiples for. \n"),
    {ok, Input} = io:read("For what number do you want to find multiples? \n> "),
    find_numbers(Input).

% This function is the one used to actually apply the filter. If there is the need to add a recursive element to a software, for instance,
% if the user wants to try again and input a different filter on the list, then this is the function to recall.
find_numbers(Number) ->
    List1 = lists:seq(1, 100),
    F = fun(X) -> X rem Number == 0 end,
    io:format("Numbers 1 through 100 that are multiples of ~w: ", [Number]),
    lists:filter(F, List1).

% This is my pattern matching function. It directs the different shape choices of the user towards their specific formula for calculating
% area and then directs that to the string output displaying the calculated formula.
pattern_match() ->
    {ok, Type} = io:read("What type of shape do you have? (circle/square/rectangle) \n> "),
    case Type of
        circle -> 
            {ok, Radius} = io:read("What is the radius of the circle? "),
            A = Radius * 3.1415;
        square -> 
            {ok, Side} = io:read("What is the length of the sides? "),
            A = Side * Side;
        rectangle ->
            {ok, Side1} = io:read("What is the length of the shorter side? "),
            {ok, Side2} = io:read("What is the length of the longer side? "),
            A = Side1 * Side2
    end,
    io:format("The area is ~w~n", [A]).