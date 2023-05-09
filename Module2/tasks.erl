-module(tasks).
-export([print_my_name/0]).
-export([print_my_bday/0]).
-export([handle_message/1]).

print_my_name() -> io:fwrite("My name is Kimball Christensen ").
print_my_bday() -> io:fwrite("My birthday is 11/14/2023 ").

handle_message({get_user, UserId}) ->
    {ok, User} = database:get_user(UserId), 
    io:format("User ~p~n", [User]),
    {reply, User}.