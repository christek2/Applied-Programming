-module(tasks).

-export([print_my_name/0]).
-export([print_my_bday/0]).
-export([lam_prac/0]).
-export([pattern_match/1]).
-export([info_sheet/0]).
-export([get_data/0]).
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

info_sheet() ->
    {ok, Fname} = io:read("What is your first name? "),
    % {ok, Lname} = io:read("What is your last name? "),
    % {ok, Number} = 1,
    % {ok, Bdate} = io:read("What is your birthday? (--/--/----) "),
    % {ok, Phone} = io:read("What is your phone number? "),
    % {ok, Email} = io:read("What is your email address? "),
    % {ok, EmerCont} = io:read("Who is your emergency contact? "),
    % {ok, ECPhone} = io:read("What is their phone number? "),
    % {ok, Allergies} = io:read("List your allergies here (type 'quit' to stop typing): "),

    % PersonalInfo = [{"Fname", Fname}, {"Lname", Lname}, {"Number", Number}, {"Bdate", Bdate}, {"Phone", Phone}, {"Email", Email}, {"EmerCont", EmerCont}, {"ECPhone", ECPhone}, {"Allergies", Allergies}],
    % io:fwrite(PersonalInfo).

    io:format("~w~n", [Fname]).


get_data() ->
    {ok, Term} = io:read("Enter a number: "),
    io:format("The number you entered plus one is: ~w~n", 
                [Term + 1]).

% handle_message({get_user, UserId}) ->
%     {ok, User} = database:get_user(UserId), 
%     io:format("User ~p~n", [User]),
%     {reply, User}.