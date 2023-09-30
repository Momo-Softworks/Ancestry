package com.momosoftworks.ancestry;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

import java.util.Arrays;

public abstract class CLJ
{
    private static final IFn REQUIRE = Clojure.var("clojure.core", "require");

    public static void require(String namespace)
    {   REQUIRE.invoke(Clojure.read(namespace));
    }

    public static Namespace getNamespace(String namespace)
    {   return new Namespace(namespace);    }

    public static class Namespace
    {
        String namespace;

        public Namespace(String namespace)
        {   this.namespace = namespace;
        }

        public Object func(String funcName, Object... args)
        {   require(namespace);
            IFn func = Clojure.var(this.namespace, funcName);
            switch (args.length)
            {
                case 0  : return func.invoke();
                case 1  : return func.invoke(args[0]);
                case 2  : return func.invoke(args[0], args[1]);
                case 3  : return func.invoke(args[0], args[1], args[2]);
                case 4  : return func.invoke(args[0], args[1], args[2], args[3]);
                case 5  : return func.invoke(args[0], args[1], args[2], args[3], args[4]);
                case 6  : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5]);
                case 7  : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
                case 8  : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
                case 9  : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8]);
                case 10 : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9]);
                case 11 : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10]);
                case 12 : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11]);
                case 13 : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12]);
                case 14 : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13]);
                case 15 : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14]);
                case 16 : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15]);
                case 17 : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16]);
                case 18 : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17]);
                case 19 : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18]);
                case 20 : return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18], args[19]);
                default:
                    Object[] extraArgs = Arrays.copyOfRange(args, 20, args.length);
                    return func.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18], args[19], extraArgs);
            }
        }
    }
}
