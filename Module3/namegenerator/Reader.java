package namegenerator;
// Was throwing error because of package named "com.example.namegenerator"

import java.util.Arrays;
import java.util.List;
import java.util.Random;
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;

public class Reader {
    public static void main(String[] args) {
        System.out.println(populate(1));
    }

    public static String populate(int BoyName) {
        List<String> boyNames = Arrays.asList("Aaron", "Abdul", "Abdullah", "Abel", "Abraham", "Abram", "Adam", "Adan",
                "Addison", "Aditya", "Adolfo", "Adonis", "Adrian", "Adrien", "Agustin", "Ahmad", "Ahmed", "Aidan",
                "Aiden", "Alan", "Albert", "Alberto", "Alden", "Aldo", "Alec", "Alejandro", "Alek", "Alessandro",
                "Alex", "Alexander", "Alexandre", "Alexandro", "Alexis", "Alfonso", "Alfred", "Alfredo", "Ali", "Allan",
                "Allen", "Alonso", "Alonzo", "Alvaro", "Alvin", "Amari", "Amir", "Anderson", "Andre", "Andreas",
                "Andres", "Andrew", "Andy", "Angel", "Angelo", "Anthony", "Antoine", "Anton", "Antonio", "Antony",
                "Antwan", "Ari", "Aric", "Ariel", "Arman", "Armando", "Armani", "Arnold", "Aron", "Arthur", "Arturo",
                "Asa", "Asher", "Ashton", "Aubrey", "August", "Augustus", "Austen", "Austin", "Auston", "Austyn",
                "Avery", "Axel", "Ayden", "Baby", "Bailey", "Barrett", "Barry", "Beau", "Ben", "Benito", "Benjamin",
                "Bennett", "Benny", "Bernard", "Bernardo", "Billy", "Blaine", "Blaise", "Blake", "Bo", "Bobby", "Brad",
                "Braden", "Bradford", "Bradley", "Bradly", "Brady", "Braeden", "Braedon", "Braiden", "Brandan",
                "Branden", "Brandon", "Brandyn", "Branson", "Brant", "Braxton", "Brayan", "Brayden", "Braydon",
                "Brendan", "Brenden", "Brendon", "Brennan", "Brennen", "Brennon", "Brent", "Brenton", "Bret", "Brett",
                "Brian", "Brice", "Bridger", "Brock", "Broderick", "Brody", "Bronson", "Brooks", "Bruce", "Bryan",
                "Bryant", "Bryce", "Brycen", "Bryson", "Byron", "Cade", "Caden", "Cale", "Caleb", "Calvin", "Camden",
                "Cameron", "Camren", "Camron", "Carl", "Carlo", "Carlos", "Carlton", "Carson", "Carter", "Casey",
                "Cayden", "Cedric", "Cesar", "Chad", "Chaim", "Chance", "Chandler", "Charles", "Charlie", "Chase",
                "Chaz", "Chris", "Christian", "Christopher", "Clarence", "Clark", "Clay", "Clayton", "Clifford",
                "Clifton", "Clint", "Clinton", "Coby", "Cody", "Colby", "Cole", "Coleman", "Colin", "Collin", "Colt",
                "Colten", "Colton", "Conner", "Connor", "Conor", "Conrad", "Cooper", "Corbin", "Cordell", "Corey",
                "Cornelius", "Cortez", "Cory", "Courtney", "Craig", "Cristian", "Cristobal", "Cristopher", "Cruz",
                "Cullen", "Curtis", "Cyrus", "Dakota", "Dakotah", "Dale", "Dallas", "Dallin", "Dalton", "Damian",
                "Damien", "Damion", "Damon", "Dandre", "Dane", "Dangelo", "Daniel", "Danny", "Dante", "Daquan",
                "Darian", "Darien", "Darin", "Dario", "Darion", "Darius", "Darnell", "Darrell", "Darren", "Darrian",
                "Darrien", "Darrin", "Darrion", "Darrius", "Darryl", "Daryl", "Dashawn", "David", "Davin", "Davion",
                "Davis", "Davon", "Davonte", "Dawson", "Dayton", "Dean", "Deandre", "Deangelo", "Declan", "Deion",
                "Dejuan", "Demarco", "Demarcus", "Demetrius", "Dennis", "Denver", "Denzel", "Deon", "Deondre",
                "Deontae", "Deonte", "Dequan", "Derek", "Derick", "Derrick", "Deshaun", "Deshawn", "Desmond", "Destin",
                "Devan", "Devante", "Deven", "Devin", "Devon", "Devonte", "Devyn", "Dewayne", "Dexter", "Diego",
                "Dillan", "Dillion", "Dillon", "Dimitri", "Dion", "Domenic", "Dominic", "Dominick", "Dominik",
                "Dominique", "Don", "Donald", "Donavan", "Donavon", "Donnie", "Donovan", "Dontae", "Donte", "Dorian",
                "Douglas", "Drake", "Draven", "Drew", "Duane", "Duncan", "Dustin", "Dwayne", "Dwight", "Dylan",
                "Dyllan", "Dylon", "Ean", "Earl", "Easton", "Eddie", "Edgar", "Eduardo", "Edward", "Edwin", "Efrain",
                "Efren", "Eli", "Elias", "Elijah", "Eliseo", "Elisha", "Elliot", "Elliott", "Ellis", "Elmer", "Elvin",
                "Elvis", "Emanuel", "Emerson", "Emiliano", "Emilio", "Emmanuel", "Emmett", "Enrique", "Eric", "Erick",
                "Erik", "Ernest", "Ernesto", "Esteban", "Estevan", "Ethan", "Eugene", "Evan", "Everett", "Ezekiel",
                "Ezequiel", "Ezra", "Fabian", "Felipe", "Felix", "Fernando", "Fidel", "Forrest", "Francesco", "Francis",
                "Francisco", "Frank", "Frankie", "Franklin", "Fred", "Freddie", "Freddy", "Frederick", "Fredrick",
                "Gabriel", "Gage", "Garett", "Garret", "Garrett", "Garrison", "Gary", "Gaven", "Gavin", "Genaro",
                "Gene", "Geoffrey", "George", "Gerald", "Gerard", "Gerardo", "German", "Giancarlo", "Gianni", "Gilbert",
                "Gilberto", "Gino", "Giovanni", "Giovanny", "Glen", "Glenn", "Gonzalo", "Gordon", "Grady", "Graham",
                "Grant", "Grayson", "Gregory", "Greyson", "Griffin", "Guadalupe", "Guillermo", "Gunnar", "Gunner",
                "Gustavo", "Guy", "Hamza", "Hans", "Harley", "Harold", "Harrison", "Harry", "Hassan", "Hayden", "Heath",
                "Hector", "Henry", "Herbert", "Heriberto", "Herman", "Hernan", "Holden", "Houston", "Howard", "Hudson",
                "Hugh", "Hugo", "Humberto", "Hunter", "Ian", "Ibrahim", "Ignacio", "Infant", "Irvin", "Irving", "Isaac",
                "Isai", "Isaiah", "Isaias", "Isiah", "Ismael", "Israel", "Issac", "Ivan", "Izaiah", "Jabari", "Jace",
                "Jack", "Jackie", "Jackson", "Jacob", "Jacoby", "Jade", "Jaden", "Jadon", "Jaiden", "Jaime", "Jairo",
                "Jake", "Jakob", "Jaleel", "Jalen", "Jalon", "Jamal", "Jamar", "Jamarcus", "Jamari", "Jamel", "James",
                "Jameson", "Jamie", "Jamil", "Jamison", "Jaquan", "Jared", "Jaren", "Jaret", "Jarod", "Jaron", "Jarred",
                "Jarrett", "Jarrod", "Jarvis", "Jason", "Jasper", "Javier", "Javon", "Jaxon", "Jaxson", "Jay", "Jayce",
                "Jayden", "Jaydon", "Jaylan", "Jaylen", "Jaylin", "Jaylon", "Jayson", "Jean", "Jeff", "Jefferson",
                "Jeffery", "Jeffrey", "Jeremiah", "Jeremy", "Jermaine", "Jerome", "Jerrod", "Jerry", "Jesse", "Jessie",
                "Jesus", "Jett", "Jimmie", "Jimmy", "Joaquin", "Joe", "Joel", "Joey", "Johan", "John", "Johnathan",
                "Johnathon", "Johnnie", "Johnny", "Jon", "Jonah", "Jonas", "Jonathan", "Jonathon", "Jordan", "Jorden",
                "Jordi", "Jordon", "Jordy", "Jorge", "Jose", "Josef", "Joseph", "Josh", "Joshua", "Josiah", "Josue",
                "Jovan", "Jovani", "Jovany", "Juan", "Judah", "Jude", "Julian", "Julien", "Julio", "Julius", "Junior",
                "Justice", "Justin", "Justus", "Justyn", "Juwan", "Kade", "Kaden", "Kadin", "Kai", "Kaleb", "Kameron",
                "Kamron", "Kane", "Kareem", "Karl", "Karson", "Kasey", "Kayden", "Keagan", "Keanu", "Keaton", "Keegan",
                "Keenan", "Keith", "Kellen", "Kelly", "Kelton", "Kelvin", "Kendall", "Kendrick", "Kennedy", "Kenneth",
                "Kenny", "Kent", "Kenyon", "Keon", "Kerry", "Keshawn", "Keven", "Kevin", "Kevon", "Keyon", "Keyshawn",
                "Khalid", "Khalil", "Kieran", "Kirk", "Kobe", "Koby", "Kody", "Kolby", "Kole", "Kolton", "Korbin",
                "Korey", "Kory", "Kristian", "Kristofer", "Kristopher", "Kurt", "Kurtis", "Kylan", "Kyle", "Kyler",
                "Ladarius", "Lamar", "Lamont", "Lance", "Landen", "Landon", "Lane", "Larry", "Latrell", "Lawrence",
                "Layne", "Lee", "Leo", "Leon", "Leonard", "Leonardo", "Leonel", "Leroy", "Lester", "Levi", "Lewis",
                "Liam", "Lincoln", "Lloyd", "Logan", "Lonnie", "Lorenzo", "Louis", "Lucas", "Luciano", "Luis", "Lukas",
                "Luke", "Mackenzie", "Madison", "Malachi", "Malcolm", "Malik", "Manuel", "Marc", "Marcel", "Marcelo",
                "Marco", "Marcos", "Marcus", "Mariano", "Mario", "Mark", "Markel", "Markell", "Markus", "Marlon",
                "Marques", "Marquez", "Marquis", "Marquise", "Marshall", "Martin", "Marvin", "Mason", "Mateo", "Mathew",
                "Matteo", "Matthew", "Maurice", "Mauricio", "Maverick", "Max", "Maximilian", "Maximillian", "Maxwell",
                "Mekhi", "Melvin", "Micah", "Michael", "Micheal", "Miguel", "Mike", "Mikel", "Miles", "Milton",
                "Misael", "Mitchel", "Mitchell", "Mohamed", "Mohammad", "Mohammed", "Moises", "Montana", "Morgan",
                "Moses", "Moshe", "Muhammad", "Myles", "Myron", "Nash", "Nasir", "Nathan", "Nathanael", "Nathanial",
                "Nathaniel", "Nathen", "Neal", "Nehemiah", "Neil", "Nelson", "Nestor", "Nicholas", "Nick", "Nickolas",
                "Nico", "Nicolas", "Nigel", "Nikhil", "Nikolas", "Noah", "Noe", "Noel", "Nolan", "Norman", "Octavio",
                "Oliver", "Omar", "Omari", "Orion", "Orlando", "Oscar", "Osvaldo", "Owen", "Pablo", "Paris", "Parker",
                "Patrick", "Paul", "Paxton", "Payton", "Pedro", "Perry", "Peter", "Peyton", "Philip", "Phillip",
                "Phoenix", "Pierce", "Pierre", "Porter", "Preston", "Prince", "Quentin", "Quincy", "Quinn", "Quinten",
                "Quintin", "Quinton", "Raekwon", "Rafael", "Raheem", "Rahul", "Ralph", "Ramiro", "Ramon", "Randall",
                "Randy", "Raphael", "Rashad", "Rashawn", "Raul", "Raven", "Ray", "Raymond", "Raymundo", "Reagan",
                "Reece", "Reed", "Reese", "Reginald", "Reid", "Reilly", "Remington", "Rene", "Reuben", "Rey",
                "Reynaldo", "Rhett", "Ricardo", "Richard", "Rick", "Rickey", "Ricky", "Rigoberto", "Riley", "River",
                "Robert", "Roberto", "Robin", "Roderick", "Rodney", "Rodolfo", "Rodrigo", "Rogelio", "Roger", "Rohan",
                "Roland", "Rolando", "Roman", "Romeo", "Ronald", "Ronaldo", "Ronnie", "Rory", "Ross", "Rowan", "Roy",
                "Royce", "Ruben", "Rudy", "Russell", "Ryan", "Ryder", "Rylan", "Sage", "Salvador", "Salvatore", "Sam",
                "Samir", "Sammy", "Samson", "Samuel", "Santiago", "Santos", "Saul", "Savion", "Sawyer", "Scott",
                "Seamus", "Sean", "Sebastian", "Semaj", "Sergio", "Seth", "Shamar", "Shane", "Shannon", "Shaun",
                "Shawn", "Shayne", "Shea", "Shelby", "Sheldon", "Shemar", "Sidney", "Silas", "Simeon", "Simon",
                "Skylar", "Skyler", "Solomon", "Sonny", "Spencer", "Stanley", "Stefan", "Stephan", "Stephen", "Stephon",
                "Sterling", "Steve", "Steven", "Stone", "Stuart", "Syed", "Tahj", "Talon", "Tanner", "Tariq", "Tate",
                "Tavion", "Taylor", "Terence", "Terrance", "Terrell", "Terrence", "Terry", "Tevin", "Thaddeus",
                "Theodore", "Thomas", "Timothy", "Titus", "Tobias", "Toby", "Todd", "Tomas", "Tommy", "Tony", "Trace",
                "Tracy", "Trae", "Travis", "Travon", "Tre", "Trent", "Trenton", "Trever", "Trevion", "Trevon", "Trevor",
                "Trey", "Treyvon", "Tristan", "Tristen", "Tristian", "Tristin", "Triston", "Troy", "Tucker", "Turner",
                "Ty", "Tyler", "Tylor", "Tyquan", "Tyree", "Tyreek", "Tyreese", "Tyrek", "Tyreke", "Tyrell", "Tyrese",
                "Tyriq", "Tyrique", "Tyron", "Tyrone", "Tyshawn", "Tyson", "Ulises", "Ulysses", "Uriel", "Valentin",
                "Vance", "Vaughn", "Vernon", "Vicente", "Victor", "Vincent", "Wade", "Walker", "Walter", "Warren",
                "Wayne", "Wesley", "Weston", "Will", "William", "Willie", "Wilson", "Winston", "Wyatt", "Xander",
                "Xavier", "Yosef", "Zachariah", "Zachary", "Zachery", "Zackary", "Zackery", "Zaire", "Zakary", "Zane",
                "Zechariah", "Zion");
        List<String> girlNames = Arrays.asList("Aaliyah", "Abagail", "Abbey", "Abbie", "Abbigail", "Abby", "Abigail",
                "Abigale", "Abigayle", "Abril", "Addison", "Adeline", "Adriana", "Adrianna", "Adrienne", "Aileen",
                "Aimee", "Aisha", "Aiyana", "Alaina", "Alana", "Alanna", "Alayna", "Aleah", "Alejandra", "Alena",
                "Alessandra", "Alex", "Alexa", "Alexandra", "Alexandrea", "Alexandria", "Alexia", "Alexis", "Alexus",
                "Alexys", "Ali", "Alia", "Alice", "Alicia", "Alina", "Alisa", "Alisha", "Alison", "Alissa", "Alivia",
                "Aliya", "Aliyah", "Alize", "Allie", "Allison", "Ally", "Allyson", "Allyssa", "Alma", "Alondra",
                "Alycia", "Alysa", "Alysha", "Alysia", "Alyson", "Alyssa", "Amanda", "Amani", "Amari", "Amaya", "Amber",
                "Amelia", "America", "Amira", "Amy", "Ana", "Anahi", "Anastasia", "Andrea", "Angel", "Angela",
                "Angelica", "Angelina", "Angelique", "Angie", "Anika", "Anissa", "Anita", "Aniya", "Aniyah", "Ann",
                "Anna", "Annabelle", "Annalise", "Annamarie", "Anne", "Annette", "Annie", "Annika", "Ansley",
                "Antoinette", "Antonia", "Anya", "April", "Araceli", "Ariana", "Arianna", "Ariel", "Arielle", "Arlene",
                "Armani", "Asha", "Ashanti", "Ashlee", "Ashleigh", "Ashley", "Ashlie", "Ashly", "Ashlyn", "Ashlynn",
                "Ashton", "Asia", "Aspen", "Athena", "Aubree", "Aubrey", "Audra", "Audrey", "Aurora", "Autumn", "Ava",
                "Avery", "Ayana", "Ayanna", "Ayla", "Aylin", "Baby", "Bailee", "Bailey", "Barbara", "Baylee", "Beatriz",
                "Berenice", "Bethany", "Beverly", "Bianca", "Blair", "Blanca", "Bonnie", "Brandi", "Brandy", "Breana",
                "Breann", "Breanna", "Breanne", "Brenda", "Brenna", "Breonna", "Bria", "Briana", "Brianna", "Brianne",
                "Bridget", "Bridgette", "Brielle", "Brionna", "Britney", "Brittani", "Brittany", "Brittney", "Brook",
                "Brooke", "Brooklyn", "Brooklynn", "Bryana", "Bryanna", "Bryn", "Brynn", "Caitlin", "Caitlyn",
                "Caitlynn", "Caleigh", "Cali", "Calista", "Callie", "Cameron", "Camila", "Camille", "Camryn", "Candace",
                "Candice", "Cara", "Carina", "Carissa", "Carla", "Carlee", "Carley", "Carli", "Carlie", "Carly",
                "Carmen", "Carol", "Carolina", "Caroline", "Carolyn", "Carrie", "Carson", "Casandra", "Casey",
                "Cassandra", "Cassidy", "Cassie", "Catalina", "Catherine", "Cayla", "Cecelia", "Cecilia", "Celeste",
                "Celia", "Celina", "Celine", "Chana", "Chandler", "Chanel", "Chantal", "Chantel", "Charity", "Charlene",
                "Charlotte", "Chasity", "Chaya", "Chelsea", "Chelsey", "Chelsie", "Cheyanne", "Cheyenne", "Chloe",
                "Christa", "Christian", "Christiana", "Christina", "Christine", "Christy", "Chyna", "Ciara", "Ciera",
                "Cierra", "Cindy", "Citlalli", "Claire", "Clara", "Clare", "Clarissa", "Claudia", "Colleen",
                "Constance", "Cora", "Corinne", "Cortney", "Courtney", "Cristal", "Cristina", "Crystal", "Cynthia",
                "Daija", "Daisha", "Daisy", "Dakota", "Dalia", "Dallas", "Damaris", "Dana", "Daniela", "Daniella",
                "Danielle", "Daphne", "Darby", "Daria", "Darian", "Darlene", "Dasia", "Dawn", "Dayna", "Deanna",
                "Deasia", "Deborah", "Deja", "Dejah", "Delaney", "Delia", "Delilah", "Denise", "Desirae", "Desiree",
                "Destany", "Destinee", "Destiney", "Destini", "Destiny", "Devin", "Devon", "Devyn", "Diamond", "Diana",
                "Diane", "Dianna", "Dominique", "Donna", "Dorothy", "Drew", "Dulce", "Ebony", "Eden", "Edith", "Eileen",
                "Elaina", "Elaine", "Eleanor", "Elena", "Eliana", "Elisa", "Elisabeth", "Elise", "Elissa", "Eliza",
                "Elizabeth", "Ella", "Ellen", "Ellie", "Elsa", "Elyse", "Elyssa", "Emely", "Emerald", "Emilee",
                "Emilia", "Emilie", "Emily", "Emma", "Emmalee", "Erica", "Ericka", "Erika", "Erin", "Eryn", "Esmeralda",
                "Esperanza", "Essence", "Estefania", "Esther", "Estrella", "Eva", "Eve", "Evelyn", "Fabiola", "Faith",
                "Fatima", "Felicia", "Felicity", "Fernanda", "Fiona", "Frances", "Francesca", "Gabriel", "Gabriela",
                "Gabriella", "Gabrielle", "Genesis", "Genevieve", "Georgia", "Gianna", "Gillian", "Gina", "Giovanna",
                "Giselle", "Gisselle", "Gladys", "Gloria", "Grace", "Gracie", "Graciela", "Greta", "Gretchen",
                "Guadalupe", "Gwendolyn", "Hailee", "Hailey", "Haleigh", "Haley", "Halie", "Halle", "Hallie", "Hana",
                "Hanna", "Hannah", "Harley", "Harmony", "Haven", "Hayden", "Haylee", "Hayley", "Haylie", "Hazel",
                "Heather", "Heaven", "Heidi", "Helen", "Helena", "Hillary", "Holly", "Hope", "Hunter", "Iliana",
                "Imani", "India", "Infant", "Ingrid", "Irene", "Iris", "Isabel", "Isabela", "Isabella", "Isabelle",
                "Isis", "Itzel", "Ivana", "Ivy", "Izabella", "Jacey", "Jacklyn", "Jaclyn", "Jacqueline", "Jacquelyn",
                "Jada", "Jade", "Jaden", "Jadyn", "Jaelyn", "Jaida", "Jaiden", "Jailene", "Jaime", "Jakayla", "Jalyn",
                "Jamie", "Jana", "Janae", "Jane", "Janelle", "Janessa", "Janet", "Janette", "Janice", "Janie",
                "Jaqueline", "Jasmin", "Jasmine", "Jasmyn", "Jaycee", "Jayda", "Jayden", "Jayla", "Jaylene", "Jazlyn",
                "Jazmin", "Jazmine", "Jazmyn", "Jazmyne", "Jeanette", "Jena", "Jenifer", "Jenna", "Jennifer", "Jenny",
                "Jesse", "Jessica", "Jessie", "Jewel", "Jill", "Jillian", "Joanna", "Joanne", "Jocelyn", "Jocelyne",
                "Jodi", "Joelle", "Johanna", "Jordan", "Jordyn", "Joselyn", "Josephine", "Josie", "Journey", "Joy",
                "Joyce", "Juana", "Juanita", "Judith", "Julia", "Juliana", "Julianna", "Julianne", "Julie", "Juliet",
                "Juliette", "Julissa", "Justice", "Justina", "Justine", "Kacey", "Kaci", "Kacie", "Kaela", "Kaelyn",
                "Kaila", "Kailee", "Kailey", "Kailyn", "Kaitlin", "Kaitlyn", "Kaitlynn", "Kaleigh", "Kaley", "Kali",
                "Kalie", "Kallie", "Kalyn", "Kameron", "Kamryn", "Kara", "Karen", "Kari", "Karina", "Karissa", "Karla",
                "Karlee", "Karley", "Karli", "Karlie", "Karly", "Kasandra", "Kasey", "Kassandra", "Kassidy", "Kassie",
                "Katarina", "Kate", "Katelin", "Katelyn", "Katelynn", "Katharine", "Katherine", "Kathleen", "Kathryn",
                "Kathy", "Katia", "Katie", "Katlin", "Katlyn", "Katlynn", "Katrina", "Katy", "Kaycee", "Kayla",
                "Kaylah", "Kaylee", "Kayleigh", "Kayley", "Kayli", "Kaylie", "Kaylin", "Kaylyn", "Kaylynn", "Keara",
                "Keeley", "Keely", "Kelley", "Kelli", "Kellie", "Kelly", "Kelsey", "Kelsi", "Kelsie", "Kendal",
                "Kendall", "Kendra", "Kenia", "Kennedi", "Kennedy", "Kenya", "Kenzie", "Keri", "Kiana", "Kianna",
                "Kiara", "Kiarra", "Kiera", "Kierra", "Kiersten", "Kiley", "Kimberly", "Kinsey", "Kira", "Kirsten",
                "Kirstin", "Kori", "Kourtney", "Krista", "Kristen", "Kristin", "Kristina", "Kristine", "Kristy",
                "Krystal", "Kyara", "Kyla", "Kylee", "Kyleigh", "Kylie", "Kyra", "Lacey", "Lacy", "Lana", "Lara",
                "Larissa", "Laura", "Laurel", "Lauren", "Lauryn", "Layla", "Lea", "Leah", "Leann", "Leanna", "Leanne",
                "Leila", "Leilani", "Lena", "Lesley", "Leslie", "Lesly", "Leticia", "Lexi", "Lexie", "Lexus", "Lia",
                "Liana", "Lila", "Lilian", "Liliana", "Lillian", "Lillie", "Lilly", "Lily", "Linda", "Lindsay",
                "Lindsey", "Lisa", "Lisette", "Lissette", "Lizbeth", "Lizeth", "Lizette", "Logan", "London", "Loren",
                "Lorena", "Lori", "Lourdes", "Lucia", "Lucy", "Luisa", "Luz", "Lydia", "Lyndsey", "Lyric", "Macey",
                "Maci", "Macie", "Mackenzie", "Macy", "Madalyn", "Maddison", "Madeleine", "Madeline", "Madelyn",
                "Madelynn", "Madilyn", "Madisen", "Madison", "Madisyn", "Madyson", "Maegan", "Maeve", "Magdalena",
                "Maggie", "Maia", "Makala", "Makayla", "Makenna", "Makenzie", "Malia", "Mallory", "Mandy", "Mara",
                "Maranda", "Marcela", "Marcella", "Margaret", "Margarita", "Maria", "Mariah", "Mariam", "Mariana",
                "Marianna", "Maribel", "Maricela", "Marie", "Mariela", "Marilyn", "Marina", "Marisa", "Marisol",
                "Marissa", "Maritza", "Marlee", "Marlene", "Marley", "Martha", "Martina", "Mary", "Mattie", "Maura",
                "Maya", "Mayra", "Mckayla", "Mckenna", "Mckenzie", "Meagan", "Meaghan", "Megan", "Meghan", "Melanie",
                "Melina", "Melinda", "Melissa", "Melody", "Mercedes", "Meredith", "Mia", "Micaela", "Micah", "Michaela",
                "Michele", "Michelle", "Mikaela", "Mikala", "Mikayla", "Miracle", "Miranda", "Mireya", "Miriam",
                "Misty", "Miya", "Mollie", "Molly", "Monica", "Monique", "Montana", "Morgan", "Moriah", "Mya", "Myah",
                "Myra", "Nadia", "Nadine", "Nancy", "Naomi", "Natalia", "Natalie", "Nataly", "Natasha", "Nathalie",
                "Nautica", "Nayeli", "Nia", "Nichole", "Nicole", "Nicolette", "Nikita", "Nikki", "Nina", "Noelia",
                "Noelle", "Noemi", "Nora", "Norma", "Nya", "Nyasia", "Odalis", "Odalys", "Olivia", "Paige", "Pamela",
                "Paola", "Paris", "Parker", "Patience", "Patricia", "Paula", "Paulina", "Payton", "Perla", "Peyton",
                "Phoebe", "Piper", "Precious", "Presley", "Princess", "Priscilla", "Quinn", "Rachael", "Rachel",
                "Rachelle", "Raegan", "Raina", "Randi", "Raquel", "Raven", "Rayna", "Reagan", "Reanna", "Rebeca",
                "Rebecca", "Rebekah", "Regan", "Regina", "Reilly", "Reina", "Renee", "Reyna", "Rhiannon", "Riley",
                "Rita", "Robin", "Robyn", "Rochelle", "Rocio", "Rosa", "Rose", "Rosemary", "Roxanne", "Ruby", "Ruth",
                "Ryan", "Ryann", "Rylee", "Ryleigh", "Rylie", "Sabrina", "Sadie", "Sage", "Saige", "Sally", "Salma",
                "Samantha", "Samara", "Sandra", "Sandy", "Sara", "Sarah", "Sarai", "Sarina", "Sasha", "Savana",
                "Savanah", "Savanna", "Savannah", "Scarlett", "Selena", "Selina", "Serena", "Serenity", "Shaina",
                "Shakira", "Shana", "Shania", "Shanice", "Shaniya", "Shannon", "Sharon", "Shauna", "Shawna", "Shayla",
                "Shaylee", "Shayna", "Shea", "Sheila", "Shelbi", "Shelbie", "Shelby", "Shianne", "Shirley", "Shyann",
                "Shyanne", "Shyla", "Sidney", "Sienna", "Sierra", "Silvia", "Simone", "Sky", "Skye", "Skyla", "Skylar",
                "Skyler", "Sofia", "Sonia", "Sonya", "Sophia", "Sophie", "Stacey", "Stacy", "Starr", "Stefanie",
                "Stella", "Stephanie", "Stephany", "Summer", "Susan", "Susana", "Suzanne", "Sydnee", "Sydney", "Sydni",
                "Sydnie", "Sylvia", "Tabitha", "Talia", "Tamara", "Tamera", "Tamia", "Tania", "Tanya", "Tara", "Taryn",
                "Tatiana", "Tatianna", "Tatum", "Tatyana", "Tatyanna", "Taya", "Tayler", "Taylor", "Teagan", "Teresa",
                "Tess", "Tessa", "Thalia", "Theresa", "Tia", "Tiana", "Tianna", "Tiara", "Tierra", "Tiffani", "Tiffany",
                "Tina", "Toni", "Tori", "Tracy", "Trinity", "Trisha", "Tyler", "Tyra", "Unique", "Valentina", "Valeria",
                "Valerie", "Vanesa", "Vanessa", "Veronica", "Victoria", "Violet", "Virginia", "Vivian", "Viviana",
                "Wendy", "Whitney", "Willow", "Yadira", "Yasmeen", "Yasmin", "Yasmine", "Yazmin", "Yesenia", "Yessenia",
                "Yolanda", "Yvette", "Yvonne", "Zaria", "Zoe", "Zoey", "Zoie");
        List<String> lastNames = Arrays.asList("Abbott", "Acevedo", "Acosta", "Adams", "Adkins", "Aguilar", "Aguirre",
                "Alexander", "Ali", "Allen", "Allison", "Alvarado", "Alvarez", "Andersen", "Anderson", "Andrade",
                "Andrews", "Anthony", "Archer", "Arellano", "Arias", "Armstrong", "Arnold", "Arroyo", "Ashley",
                "Atkins", "Atkinson", "Austin", "Avery", "Avila", "Ayala", "Ayers", "Bailey", "Baird", "Baker",
                "Baldwin", "Ball", "Ballard", "Banks", "Barajas", "Barber", "Barker", "Barnes", "Barnett", "Barr",
                "Barrera", "Barrett", "Barron", "Barry", "Bartlett", "Barton", "Bass", "Bates", "Bauer", "Bautista",
                "Baxter", "Bean", "Beard", "Beasley", "Beck", "Becker", "Bell", "Beltran", "Bender", "Benitez",
                "Benjamin", "Bennett", "Benson", "Bentley", "Benton", "Berg", "Berger", "Bernard", "Berry", "Best",
                "Bird", "Bishop", "Black", "Blackburn", "Blackwell", "Blair", "Blake", "Blanchard", "Blankenship",
                "Blevins", "Bolton", "Bond", "Bonilla", "Booker", "Boone", "Booth", "Bowen", "Bowers", "Bowman", "Boyd",
                "Boyer", "Boyle", "Bradford", "Bradley", "Bradshaw", "Brady", "Branch", "Brandt", "Braun", "Bray",
                "Brennan", "Brewer", "Bridges", "Briggs", "Bright", "Brock", "Brooks", "Brown", "Browning", "Bruce",
                "Bryan", "Bryant", "Buchanan", "Buck", "Buckley", "Bullock", "Burch", "Burgess", "Burke", "Burnett",
                "Burns", "Burton", "Bush", "Butler", "Byrd", "Cabrera", "Cain", "Calderon", "Caldwell", "Calhoun",
                "Callahan", "Camacho", "Cameron", "Campbell", "Campos", "Cannon", "Cantrell", "Cantu", "Cardenas",
                "Carey", "Carlson", "Carney", "Carpenter", "Carr", "Carrillo", "Carroll", "Carson", "Carter", "Case",
                "Casey", "Castaneda", "Castillo", "Castro", "Cervantes", "Chambers", "Chan", "Chandler", "Chaney",
                "Chang", "Chapman", "Charles", "Chase", "Chavez", "Chen", "Cherry", "Choi", "Christensen", "Christian",
                "Chung", "Church", "Cisneros", "Clark", "Clarke", "Clay", "Clayton", "Clements", "Cline", "Cobb",
                "Cochran", "Coffey", "Cohen", "Cole", "Coleman", "Collier", "Collins", "Colon", "Combs", "Compton",
                "Conley", "Conner", "Conrad", "Contreras", "Conway", "Cook", "Cooke", "Cooley", "Cooper", "Copeland",
                "Cordova", "Cortez", "Costa", "Cowan", "Cox", "Craig", "Crane", "Crawford", "Crosby", "Cross", "Cruz",
                "Cuevas", "Cummings", "Cunningham", "Curry", "Curtis", "Dalton", "Daniel", "Daniels", "Daugherty",
                "Davenport", "David", "Davidson", "Davies", "Davila", "Davis", "Dawson", "Day", "Dean", "Decker",
                "Delacruz", "Deleon", "Delgado", "Dennis", "Diaz", "Dickerson", "Dickson", "Dillon", "Dixon", "Dodson",
                "Dominguez", "Donaldson", "Donovan", "Dorsey", "Dougherty", "Douglas", "Downs", "Doyle", "Drake",
                "Duarte", "Dudley", "Duffy", "Duke", "Duncan", "Dunlap", "Dunn", "Duran", "Durham", "Dyer", "Eaton",
                "Edwards", "Elliott", "Ellis", "Ellison", "English", "Erickson", "Escobar", "Esparza", "Espinoza",
                "Estes", "Estrada", "Evans", "Everett", "Ewing", "Farley", "Farmer", "Farrell", "Faulkner", "Ferguson",
                "Fernandez", "Ferrell", "Fields", "Figueroa", "Finley", "Fischer", "Fisher", "Fitzgerald",
                "Fitzpatrick", "Fleming", "Fletcher", "Flores", "Flowers", "Floyd", "Flynn", "Foley", "Forbes", "Ford",
                "Foster", "Fowler", "Fox", "Francis", "Franco", "Frank", "Franklin", "Frazier", "Frederick", "Freeman",
                "French", "Frey", "Friedman", "Fritz", "Frost", "Fry", "Frye", "Fuentes", "Fuller", "Gaines",
                "Gallagher", "Gallegos", "Galloway", "Galvan", "Gamble", "Garcia", "Gardner", "Garner", "Garrett",
                "Garrison", "Garza", "Gates", "Gay", "Gentry", "George", "Gibbs", "Gibson", "Gilbert", "Giles", "Gill",
                "Gillespie", "Gilmore", "Glass", "Glenn", "Glover", "Golden", "Gomez", "Gonzales", "Gonzalez", "Good",
                "Goodman", "Goodwin", "Gordon", "Gould", "Graham", "Grant", "Graves", "Gray", "Green", "Greene",
                "Greer", "Gregory", "Griffin", "Griffith", "Grimes", "Gross", "Guerra", "Guerrero", "Gutierrez",
                "Guzman", "Haas", "Hahn", "Hale", "Haley", "Hall", "Hamilton", "Hammond", "Hampton", "Hancock", "Haney",
                "Hanna", "Hansen", "Hanson", "Hardin", "Harding", "Hardy", "Harmon", "Harper", "Harrell", "Harrington",
                "Harris", "Harrison", "Hart", "Hartman", "Harvey", "Hatfield", "Hawkins", "Hayden", "Hayes", "Haynes",
                "Hays", "Heath", "Hebert", "Henderson", "Hendricks", "Hendrix", "Henry", "Hensley", "Henson", "Herman",
                "Hernandez", "Herrera", "Herring", "Hess", "Hester", "Hickman", "Hicks", "Higgins", "Hill", "Hines",
                "Hinton", "Ho", "Hobbs", "Hodge", "Hodges", "Hoffman", "Hogan", "Holden", "Holder", "Holland",
                "Holloway", "Holmes", "Holt", "Hood", "Hooper", "Hoover", "Hopkins", "Horn", "Horne", "Horton", "House",
                "Houston", "Howard", "Howe", "Howell", "Huang", "Hubbard", "Huber", "Hudson", "Huerta", "Huff",
                "Huffman", "Hughes", "Hull", "Humphrey", "Hunt", "Hunter", "Hurley", "Hurst", "Hutchinson", "Huynh",
                "Ibarra", "Ingram", "Irwin", "Jackson", "Jacobs", "Jacobson", "James", "Jarvis", "Jefferson", "Jenkins",
                "Jennings", "Jensen", "Jimenez", "Johns", "Johnson", "Johnston", "Jones", "Jordan", "Joseph", "Joyce",
                "Juarez", "Kaiser", "Kane", "Kaufman", "Keith", "Keller", "Kelley", "Kelly", "Kemp", "Kennedy", "Kent",
                "Kerr", "Key", "Khan", "Kidd", "Kim", "King", "Kirby", "Kirk", "Klein", "Kline", "Knapp", "Knight",
                "Knox", "Koch", "Kramer", "Krause", "Krueger", "Lam", "Lamb", "Lambert", "Landry", "Lane", "Lang",
                "Lara", "Larsen", "Larson", "Lawrence", "Lawson", "Le", "Leach", "Leblanc", "Lee", "Leon", "Leonard",
                "Lester", "Levine", "Levy", "Lewis", "Li", "Lin", "Lindsey", "Little", "Liu", "Livingston", "Lloyd",
                "Logan", "Long", "Lopez", "Love", "Lowe", "Lowery", "Lozano", "Lucas", "Lucero", "Luna", "Lutz",
                "Lynch", "Lynn", "Lyons", "Macdonald", "Macias", "Mack", "Madden", "Maddox", "Mahoney", "Maldonado",
                "Malone", "Mann", "Manning", "Marks", "Marquez", "Marsh", "Marshall", "Martin", "Martinez", "Mason",
                "Massey", "Mata", "Mathews", "Mathis", "Matthews", "Maxwell", "May", "Mayer", "Maynard", "Mayo", "Mays",
                "Mcbride", "Mccall", "Mccann", "Mccarthy", "Mccarty", "Mcclain", "Mcclure", "Mcconnell", "Mccormick",
                "Mccoy", "Mccullough", "Mcdaniel", "Mcdonald", "Mcdowell", "Mcfarland", "Mcgee", "Mcgrath", "Mcguire",
                "Mcintosh", "Mcintyre", "Mckay", "Mckee", "Mckenzie", "Mckinney", "Mcknight", "Mclaughlin", "Mclean",
                "Mcmahon", "Mcmillan", "Mcneil", "Mcpherson", "Meadows", "Medina", "Mejia", "Melendez", "Melton",
                "Mendez", "Mendoza", "Mercado", "Mercer", "Merritt", "Meyer", "Meyers", "Meza", "Michael", "Middleton",
                "Miles", "Miller", "Mills", "Miranda", "Mitchell", "Molina", "Monroe", "Montes", "Montgomery",
                "Montoya", "Moody", "Moon", "Mooney", "Moore", "Mora", "Morales", "Moran", "Moreno", "Morgan", "Morris",
                "Morrison", "Morrow", "Morse", "Morton", "Moses", "Mosley", "Moss", "Moyer", "Mueller", "Mullen",
                "Mullins", "Munoz", "Murillo", "Murphy", "Murray", "Myers", "Nash", "Navarro", "Neal", "Nelson",
                "Newman", "Newton", "Nguyen", "Nichols", "Nicholson", "Nielsen", "Nixon", "Noble", "Nolan", "Norman",
                "Norris", "Norton", "Novak", "Nunez", "Obrien", "Ochoa", "Oconnell", "Oconnor", "Odom", "Odonnell",
                "Oliver", "Olsen", "Olson", "Oneal", "Oneill", "Orozco", "Orr", "Ortega", "Ortiz", "Osborn", "Osborne",
                "Owen", "Owens", "Pace", "Pacheco", "Padilla", "Page", "Palmer", "Park", "Parker", "Parks", "Parrish",
                "Parsons", "Patel", "Patrick", "Patterson", "Patton", "Paul", "Payne", "Pearson", "Peck", "Pena",
                "Pennington", "Perez", "Perkins", "Perry", "Peters", "Petersen", "Peterson", "Petty", "Pham", "Phelps",
                "Phillips", "Pierce", "Pineda", "Pittman", "Pitts", "Pollard", "Ponce", "Poole", "Pope", "Porter",
                "Potter", "Potts", "Powell", "Powers", "Pratt", "Preston", "Price", "Prince", "Proctor", "Pruitt",
                "Pugh", "Quinn", "Ramirez", "Ramos", "Ramsey", "Randall", "Randolph", "Rangel", "Rasmussen", "Ray",
                "Raymond", "Reed", "Reese", "Reeves", "Reid", "Reilly", "Reyes", "Reynolds", "Rhodes", "Rice", "Rich",
                "Richard", "Richards", "Richardson", "Richmond", "Riddle", "Riggs", "Riley", "Rios", "Ritter", "Rivas",
                "Rivera", "Rivers", "Roach", "Robbins", "Roberson", "Roberts", "Robertson", "Robinson", "Robles",
                "Rocha", "Rodgers", "Rodriguez", "Rogers", "Rojas", "Rollins", "Roman", "Romero", "Rosales", "Rosario",
                "Rose", "Ross", "Roth", "Rowe", "Rowland", "Roy", "Rubio", "Ruiz", "Rush", "Russell", "Russo", "Ryan",
                "Salas", "Salazar", "Salinas", "Sampson", "Sanchez", "Sanders", "Sandoval", "Sanford", "Santana",
                "Santiago", "Santos", "Saunders", "Savage", "Sawyer", "Schaefer", "Schmidt", "Schmitt", "Schneider",
                "Schroeder", "Schultz", "Schwartz", "Scott", "Sellers", "Serrano", "Sexton", "Shaffer", "Shah",
                "Shannon", "Sharp", "Shaw", "Shea", "Shelton", "Shepard", "Shepherd", "Sheppard", "Sherman", "Shields",
                "Short", "Silva", "Simmons", "Simon", "Simpson", "Sims", "Singh", "Singleton", "Skinner", "Sloan",
                "Small", "Smith", "Snow", "Snyder", "Solis", "Solomon", "Sosa", "Soto", "Sparks", "Spears", "Spence",
                "Spencer", "Stafford", "Stanley", "Stanton", "Stark", "Steele", "Stein", "Stephens", "Stephenson",
                "Stevens", "Stevenson", "Stewart", "Stokes", "Stone", "Stout", "Strickland", "Strong", "Stuart",
                "Suarez", "Sullivan", "Summers", "Sutton", "Swanson", "Sweeney", "Tanner", "Tapia", "Tate", "Taylor",
                "Terrell", "Terry", "Thomas", "Thompson", "Thornton", "Todd", "Torres", "Townsend", "Tran", "Travis",
                "Trevino", "Trujillo", "Tucker", "Turner", "Tyler", "Underwood", "Valdez", "Valencia", "Valentine",
                "Valenzuela", "Vance", "Vang", "Vargas", "Vasquez", "Vaughan", "Vaughn", "Vazquez", "Vega", "Velasquez",
                "Velazquez", "Velez", "Villa", "Villanueva", "Villarreal", "Villegas", "Vincent", "Wade", "Wagner",
                "Walker", "Wall", "Wallace", "Waller", "Walls", "Walsh", "Walter", "Walters", "Walton", "Wang", "Ward",
                "Ware", "Warner", "Warren", "Washington", "Waters", "Watkins", "Watson", "Watts", "Weaver", "Webb",
                "Weber", "Webster", "Weeks", "Weiss", "Welch", "Wells", "Werner", "West", "Wheeler", "Whitaker",
                "White", "Whitehead", "Whitney", "Wiggins", "Wilcox", "Wiley", "Wilkerson", "Wilkins", "Wilkinson",
                "Williams", "Williamson", "Willis", "Wilson", "Winters", "Wise", "Wolf", "Wolfe", "Wong", "Wood",
                "Woodard", "Woods", "Woodward", "Wright", "Wu", "Wyatt", "Yang", "Yates", "Yoder", "York", "Young",
                "Yu", "Zamora", "Zavala", "Zhang", "Zimmerman", "Zuniga");

        // This block of code that follows is what I originally hoped to accomplish. It
        // is supposed to reach in to the file called "name.csv"
        // and read the names that are printed there. It will split them up, put them
        // into their respective lists, and then pull random ones
        // out to be displayed.

        // String path = "\\name.csv";
        //
        // I believe that the problem I face here is writing the correct path here^.
        // The rest of the block below uses the BufferedReader to read from the file
        // specified above, splitting the csv into the respective lists
        //
        // String line = "";
        // List<String> boyNames = new ArrayList<>();
        // List<String> girlNames = new ArrayList<>();
        // List<String> lastNames = new ArrayList<>();
        //
        // try {
        // BufferedReader br = new BufferedReader(new FileReader(path));
        //
        // while ((line = br.readLine()) != null) {
        // String[] parts = line.split(",");
        // boyNames.add(parts[0]);
        // girlNames.add(parts[1]);
        // lastNames.add(parts[2]);
        // }
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // I leave all of this here, with the name.csv file so that I can return to this
        // project to finish it the way I had originally planned.

        // This block takes the binary input of BoyName from the method and then decides
        // whether to display a boy name or not
        if (BoyName == 1) {
            Random rnd1 = new Random();
            Random rnd2 = new Random();
            String fName = boyNames.get(rnd1.nextInt(1000));
            String lName = lastNames.get(rnd2.nextInt(1000));
            return String.format("%s %s", fName, lName);
        } else if (BoyName == 0) {
            Random rnd1 = new Random();
            Random rnd2 = new Random();
            String fName = girlNames.get(rnd1.nextInt(1000));
            String lName = lastNames.get(rnd2.nextInt(1000));
            return String.format("%s %s", fName, lName);
        } else {
            return "Error";
        }
    }
}