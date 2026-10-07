What is abstraction in Java?
=============================
    only showing essenntial or important information. hiding internal details.

Real time Example:
    Driver:
    *driver knowing only how to apply break,horn.acelletor, ......

    atm machine:
    
    tv remote:

what is encapsulation in java?
==============================
    *Wrapping of data

    *technical: class (var+method)

real time examples:
===================
    *ex: Tube tablet

Access Specifier:
=================

    *private
    *public
    *protected
    *default


                   pack1(folder)                                                   pack2(another folder)

                   base            derive              main                    base                derive

    private        yes             no                  no                      no                   no
    public         yes             yes                 yes                     yes                  yes
    protected      yes             yes                 yes                     no                   yes
    default        yes             yes                 yes                     no                   no
    


Exception handling:
==================

definition:  To avoid runtime or dynamic error

types:
    1)checked exception (compile time)
    2)unchecked exception (runtime)

inbuilt Exception:
        -ArithmeticException  (0 / 0  any/0 )
        -InputMismatchException (wrong input format)
        -ArrayIndexOutOfBoundException  (out of range)
        -