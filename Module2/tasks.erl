-module(tasks).
-export([print_my_name/0]).
-export([print_my_bday/0]).
-export([lam_prac/0]).
-export([pattern_match/0]).
% -export([get_data/0]).
% -export([handle_message/1]).

print_my_name() -> io:fwrite("My name is Kimball Christensen \n").
print_my_bday() -> io:fwrite("My birthday is 11/14/2023 ").
lam_prac() -> 
    F = fun(X) -> 2*X end,
    F(16).

pattern_match() ->
    {ok, Type} = io:read("What type of shape do you have? \n"),
    io:format("The shape you entered is: ~w~n",
    [Type]),

    case Type of
        circle -> io:fwrite("false \n");
        square -> io:fwrite("true \n")
    end.

% get_data() ->
%     {ok, Term} = io:read("Enter a number: "),
%     io:format("The number you entered plus one is: ~w~n", 
%                 [Term + 1]).

% handle_message({get_user, UserId}) ->
%     {ok, User} = database:get_user(UserId), 
%     io:format("User ~p~n", [User]),
%     {reply, User}.