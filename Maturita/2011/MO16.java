/*
 * Maturitni otazka c.: 16
 * Nazev: Databáze – jazyk SQL
 * Základní příkazy jazyka SQL:
    * SELECT (filtrování a řazení záznamů, spojování více tabulek, seskupování dat),
    * INSERT, UPDATE, DELETE
 */

package MaturitniOtazky;

/**
 *
 * @author Felix
 */
public class MO16 {

    public static String SQL;
    /*
     * Terminologie:
     * SQL = Structured English Query Language
     */

    public void tvorbaDatabazeUkazka(){

        /*
         * Vytvori databazi test
         * Pokud server bezi na WINDOWS stroji, tak nezalezi na velikosti pismen
         * Pokud server bezi na LINUXU, tak muzu existovat databaze Test a test
         */
        SQL = "create database test;";

       /*
        * Pokud databaze existuje, server vyhodi chybu
            * mysql> create database test;
            * ERROR 1007 (HY000): Can't create database 'test'; database exists
        * Tomu lze predejit klauzuli if not exists
        */
        SQL = "create database if not exists test;";

       /*
        * Pokud chceme deklarovat i kodovani databaze..
        */
        SQL = "create database latin character set latin2 collate latin2_czech_cs;";
    }

    public void zruseniDatabazeUkazka(){

        // [if exists] muze a nemusi byt (pouzivame v praxy bez [])
        SQL = "drop database [if exists] test;";

    }

    public void tvorbaTablkyUkazka(){

        /*
         * Zakladni model:
         * create table [nazev tabulky] ([nazev sloupce] [typ sloupce]...);
         */

        // vytvori tabulku seznam s jednim sloupcem id, ktery je typu int(integer)
        SQL = "create table seznam (id int);";

        // dalsi priklady
        SQL = "create table knihy (nazev VARCHAR (50), rok_vydani YEAR, zakoupeno DATETIME);";
        SQL = "create table zamestanci (jmeno VARCHAR (20) NOT NULL, prijmeni VARCHAR (25) NOT NULL);";

        // slozitejsi priklady
        SQL = "create table lidi (prijmeni VARCHAR (50) NOT NULL, rok_nastupu YEAR DEFAULT 2005 NOT NULL);";
        
    }

    public void zmenaTabulkyUkazka(){

        /*
         * Duvody proc meni tabulku (nejcastejsi) :
         * přidat nějaký sloupec k existující tabulce
         * odebrat sloupec z tabulky
         * změnit existující sloupec - buď jeho typ, nebo jeho název, nebo obojí.
         */

        // pridat sloupec
        SQL = "alter table account add column account_balance decimal (10,2);";

        // zmena sloupce, jeho nazev a typ
        SQL = "alter table account change column account_balance account_balance2 decimal (14,2);";

        // odstraneni sloupce
        SQL = "alter table account drop column account_balance2;";
        
    }

    public void kopirovaniTabulkyUkazka(){

        /*
         * Ne moc znamou vychytavkou v MySQL je kopirovani struktury tabulek,
         * na to slouzi fce like
         */
        SQL = "create table account2 like account;";
        
    }

    public void prejmenovaniTabulkyUkazka(){

        SQL = "rename table cislovani to cislovani2;";

    }

    public void zruseniTabulkyUkazka(){

        // podobne jako u databaze
        SQL = "drop table [if exists] uzivatele;";

    }

    public void tvorbaDocasneTabulkyUkazka(){

        /*
         * Docasne tabulky exituji pouze do ukonceni spojeni, tedy jakmile zanikne spojeni, zaniknou i tabulky
         * V praxy od connect() do disconnect(), od open() do close()
         */

        SQL = "create temporary table PENIZE (mnozstvi int);";

        // vytvori docasnou tabulku PENIZE2 okopirovanou od PENIZE
        SQL = "create temporary table PENIZE2 like PENIZE;";
        
    }

    public void seznamTabulekUkazka(){

        SQL = "show tables from mydb";
    
    }

    public void vkladaniDatUkazka(){

        // Vlozi 1 radek do tabulky knihy a do sloupcu nazev a autor
        SQL = "insert into knihy (nazev, autor) values ('Moje knizka', 'Jakub Vrana');";

        // Vlozi 2 radky do tabulky.. (neni moc zname)
        SQL = "insert into knihy (nazev, autor) values ('Nazev1', 'Autor1'), ('Nazev2', 'Autor2');";

        // Vlozi se data, ktera jiz jsou obsazena v jine tabulce
        SQL = "insert into archiv_faktur select * from faktury;";

        // Vlozit se vyraz, ktery databaze automaticky zpracuje
        SQL = "insert into vypocty values (1+2);";
        SQL = "insert into vypocty values (3*4);";
        SQL = "insert into vypocty values (20/5)";

    }

    public void upravovaniDatUkazka(){

        // upravi polozku castka v tabulce penize
        SQL = "update penize set castka = 100;";

        // uprava vice polozek, polozky se oddeluji ',' (carkou)
        SQL = "update penize set castka = 100, dph=19, castka_s_dani=119;";

        // uprava ceny v tabulce faktura, vsude kde se cislo = 20050126
        SQL = "update faktura set cena = 1500 where cislo = 20050126;";

        /*
         * Parametry v podmince dotazu, tedy za where, se daji oddelovat ',' nebo OR a nebo AND
         */
        SQL = "update uzivatele set jmeno = 'Felix' where id = '5' or (email = 'felix@rychnov.cz' and address = 'RK')";
        
    }

    public void mazaniDatUkazka(){

        // smaze z tabulky faktury vsechny radky kde cena se rovna 500
        SQL = "delete * from faktury where cena = 500;";

        // smaze z tabulky faktury 1 radek kde cena se rovna 500 (prvni co najde)
        SQL = "delete * from faktury where cena = 500 limit 1;";
        
    }

    public void vypraznitTabulkuUkazka(){

        // vyprazdni tabulku faktury, nastaveni primarni_klic na 1
        SQL = "truncate table faktury;";

    }

    public void vyhledavaniDatUkazka(){

        /*
         * Vyhledavani dat je obecne nejslozitejsi proces, na ktery je kladen velky duraz
         */

        // Vrati pole z tabulky zamestnanci s prvky jmeno, prijimeni a plat
        SQL = "select jmeno, prijmeni, plat from zamestnanci;";

        // Pouziti aliasu, vrati pole emailu. pristupujeme k promene email
        SQL = "select uidad_email as email from tabulka;";

        // Filtrace dat, vrati pole knih kde cena je mensi nebo rovna 500
        SQL = "select * from knihy where cena <=500;";

        // Slozitejsi filtrace
        SQL = "select * from knihy where cena <=500 and obor='počítače';";

        // Porovnavani hodnot, vrati pole knih v rozmezi kdy byly porizeny
        SQL = "select * from knihy where porizeno between '20050401' and '20050430';";

        // Vrati pole knih, kde autor zacina na D****..
        // % - zastupuje jakykoli znak, pocet od 0 do nekonecna
        // _ - zastupuje jakykoli 1 znak
        SQL = "select * from knihy where autor like 'D%';";

        // Vice prvku v seznamu
        // Vypise vsechny lidi, kteri bydli v Praze, Brne nebo Ostrave
        SQL = "select * from lidi where mesto in ('Praha', 'Brno', 'Ostrava');";

        // Razeni dat, pouzivame ORDER BY
        SQL = "select * from faktury order by datum;";
        SQL = "select * from knihy where cena >= 500 order by nazev;";

        // Muzeme pouzit vice prvku k razeni
        SQL = "select * from faktury order by datum, cas;";

        // Vzestupne a sestupne
        // DSC - sestupne (=descending)
        // ASC - vzestupne (=ascending)
        SQL = "select * from zamestnanci order by datum nastupu desc, prijmeni asc, jmeno;";

    }

    public void spojovaniTabulekUkazka(){

        // Nejjednodussi zapis
        /*
         * Tento zapis nam vrati vysledek tvoreny kombinaci se vsemi radky druhe tabulky,
         * takze kdyz ma tabulka knihy 2 radky a druhy 5, vysledek bude obsahovat 10 radku,
         * coz se nam prilis nehodi.
         */
        SQL = "SELECT * FROM knihy, druhy;";

        // Drobna uprava, presto ale neni vysledek prilis pouzitelny
        // Zobrazeny jsou pouze zaznamy, ktere si presne odpovidaji
        // Kniha bez uvedeneho zanru se vubec nezobrazi
        SQL = "select * from knihy, zanry where knihy.druh = zanry.id;";


        
        /*
         * VNITRNI SPOJENI
         */

        // Lepsi zapis predchoziho prikladu
        // Znovu ale zobrazi jen zaznamy, ktere si presne odpovidaji
        // Prvky v dotazu se radi nasledovne: SELECT, INNTER, WHERE, RAZENI
        // Slovo innter se da vynechat, dotaz bude proveden stejne
        SQL = "select * from knihy inner join zanry on knihy.druh = zanry.id;";



        /*
         * VNEJSI SPOJENI 
         */

        // Zobrazi se vsechny knihy a knim prislusne zanry
        // Da se pouzit LEFT nebo RIGHT JOIN - doba provadeni dotazu je analogicka
        // Sloupce, ktere spolu neodpovidaji se vyplni hodnotou NULL
        // Kniha, ktera nema vyplneny zanr tam bude mit NULL
        SQL = "select * from knihy left join zanry on knihy.druh = zanry.id;";



       /*
        * VICENASOBNA SPOJENI
        */

       // Pocet spojeni neni omezen
       SQL = "select * from knihy left join zanry on knihy.druh = zanry.id left join autor on knihy.autor = autor.id;";



       /*
        * EXOTICKA SPOJENI
        */

       // CROSS JOIN
        SQL = "SELECT * FROM knihy, zanry;";
        SQL = "SELECT * FROM knihy cross join zanry;";
        // analogicky
        // v praxy nepouzitelny

       // NATURAL JOIN
        SQL = "SELECT * FROM knihy natural join zanry;";
        // Vratil by takove radky kde by nazev knihy byl shodny s nazvem zanru + zobrazila by id radku obou tabulek tabulek 

       // JOIN ... USING
        SQL = "SELECT nazev FROM knihy natural join zanry;";
        // Stejny jako natural join akorat povoluje definovat u jakych sloupcu se shoda vyhledava
        
    }

    public void obecnyPrehledUkazka(){

        /*
         * Drobny obecny prehled
         */

        SQL = "create database [if not exists] [název databaze];";
            SQL = "create database [název databaze] character set [nazev kodovani] collate [cely nazev kodovani];";
        SQL = "drop database [název tabulky];";
            SQL = "drop database [if exists] [nazev_tabulky];";
        SQL = "create table [název tabulky] ([název sloupce] [typ sloupce]...);";
            SQL = "create table [název 1. tabulky] like [název 2. tabulky];";
        SQL = "alter table [název tabulky] [prikaz];";
        SQL = "rename table [název tabulky] to [novy název tabulky];";
        SQL = "drop table [if exists] [název tabulky];";
        SQL = "create temporary table [název tabulky] ([název sloupce] [typ sloupce]...);";
        SQL = "show tables from [název databaze]";
        SQL = "insert into [název tabulky] ([název sloupce]..) values ([hodnota]...);";
        SQL = "update [název tabulky] set [[název sloupce] = [hodnota]..]";
        SQL = "delete * from [název tabulky]";
        SQL = "truncate table [název tabulky];";
        SQL = "select [seznam sloupcu] from [název tabulky];";
        SQL = "SELECT * FROM [název 1. tabulky], [název 2. tabulky];";
           SQL = "SELECT * FROM [název 1. tabulky] inner join on [název 1. tabulky].[nazev sloupce]=[název 2. tabulky].[nazev sloupce];";
           SQL = "SELECT * FROM [název 1. tabulky] left|right join on [název 1. tabulky].[nazev sloupce]=[název 2. tabulky].[nazev sloupce];";

    }

    public static void main(String[] args) {
    }
}
