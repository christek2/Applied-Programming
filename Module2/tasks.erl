-module(tasks).

-export([print_my_name/0]).
-export([print_my_bday/0]).
-export([lam_prac/0]).
-export([pattern_match/1]).
-export([rec_prac/0]).
-export([start/0]).
-export([do_loop/1]).
% -export([get_data/0]).
% -export([handle_message/1]).

print_my_name() -> io:fwrite("My name is Kimball Christensen \n").
print_my_bday() -> io:fwrite("My birthday is 11/14/2023 ").
lam_prac() -> 
    F = fun(X) -> 2*X end,
    F(16).

pattern_match(Type) ->

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

rec_prac() ->
    List1 = [1, 2, 3, 4, 5],
    io:fwrite("~w~n", [List1]).

start() -> 
    A = 5, 
    B = 6, 
    
    if 
        A == B -> 
            io:fwrite("True"); 
        true -> 
            io:fwrite("True") 
    end.

do_loop(Count) -> 
    io:fwrite("~w~n", [Count]),
    do_loop(Count -1).


% get_data() ->
%     {ok, Term} = io:read("Enter a number: "),
%     io:format("The number you entered plus one is: ~w~n", 
%                 [Term + 1]).

% handle_message({get_user, UserId}) ->
%     {ok, User} = database:get_user(UserId), 
%     io:format("User ~p~n", [User]),
%     {reply, User}.