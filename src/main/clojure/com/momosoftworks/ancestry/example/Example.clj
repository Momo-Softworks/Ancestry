(ns com.momosoftworks.ancestry.example.Example
  (:import (net.minecraft.util DamageSource)))

(defn on-player-tick [event]
  (.attackEntityFrom (.player event) DamageSource/generic 1000))
