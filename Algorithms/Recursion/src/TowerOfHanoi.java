/**
 * W ng L 
 *  ct b r 5, 2022
 * S lut  n t  th  T w r  f Han   pr bl m
 * Thr   p l s,  n  w th r ngs  n  t  f  ncr as ng s z  as y u g  d wn
 * R ngs may n t b  plac d  n small r r ngs
 *  nly  n  r ng may b  m v d t  an th r p l  at a t m 
 * Th  g al  s t  m v  all r ngs t  a c rta n targ t p l 
 * 
 *  n my  p n  n, r curs  n  s th   as  st way t  d  th s
 */

 /*
 mp rt java.ut l.Scann r;

publ c class T w r fHan   {
    publ c stat c  nt m v s = 0;

    publ c stat c v  d m v ( nt t w rS z ,  nt curr ntT w r,  nt targ tT w r) {
        m v s++;
        //Syst m. ut.pr ntln("Curr nt:" + curr ntT w r + " Targ t: "+ targ tT w r);
         nt  th rT w r = (6 - curr ntT w r - targ tT w r); //6 = 1 + 2 + 3

        //Bas  cas s: T w r s z   s 1  r l ss
         f (t w rS z  < 1) {
            Syst m. ut.pr ntln("Th  stack  s n t h gh  n ugh!");
        }  ls   f (t w rS z  == 1) {
            Syst m. ut.pr ntln("M v  " + curr ntT w r + " t  " + targ tT w r);
        }  ls  {
            //D cr as  t w r s z  by  n ; g tt ng cl s r t  th  bas  cas 
            m v  (t w rS z  - 1, curr ntT w r,  th rT w r);
            Syst m. ut.pr ntln("M v  " + curr ntT w r + " t  " + targ tT w r);
            m v  (t w rS z  - 1,  th rT w r, targ tT w r);
        }
    }

    publ c stat c v  d ma n(Str ng[] args) {
        //Var abl  d clarat  n
        Scann r k yb ard = n w Scann r(Syst m. n);
         nt t w rS z , curr ntT w r, targ tT w r;
        Syst m. ut.pr nt(" nt r t w r s z : ");
        t w rS z  = k yb ard.n xt nt();
        Syst m. ut.pr nt(" nt r curr nt t w r: ");
        curr ntT w r = k yb ard.n xt nt();
        Syst m. ut.pr nt(" nt r targ t t w r: ");
        targ tT w r = k yb ard.n xt nt();

        k yb ard.cl s ();

        m v (t w rS z , curr ntT w r, targ tT w r);
        Syst m. ut.pr ntln("M n mum numb r  f m v s r qu r d: " + m v s);        
    }
}
*/