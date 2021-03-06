(ns overtone.core
  (:use [overtone.libs boot-msg app-icon]
        [overtone.helpers.ns])
  (:require clojure.stacktrace
            [overtone.config store]
            [overtone version midi osc speech]
            [overtone.algo chance scaling trig]
            [overtone.sc bindings buffer bus envelope example info
                         ugens defcgen node sample server synth trigger]
            [overtone.sc.cgens oscillators demand mix io buf-io env tap line freq]
            [overtone.music rhythm pitch tuning time]
            [overtone.studio mixer inst util fx wavetable midi core]
            [overtone.repl ugens examples shell inst debug]
            [overtone.libs asset event freesound]
            [overtone.gui scope mixer control]))

(defn immigrate-overtone-core []
  (immigrate
   'overtone.osc
   'overtone.midi
   'overtone.algo.chance
   'overtone.algo.scaling
   'overtone.algo.trig
   'overtone.config.store
   'overtone.sc.bindings
   'overtone.sc.buffer
   'overtone.sc.bus
   'overtone.sc.envelope
   'overtone.sc.example
   'overtone.sc.info
   'overtone.sc.node
   'overtone.sc.sample
   'overtone.sc.server
   'overtone.sc.synth
   'overtone.sc.trigger
   'overtone.sc.ugens
   'overtone.sc.defcgen
   'overtone.sc.cgens.oscillators
   'overtone.sc.cgens.demand
   'overtone.sc.cgens.mix
   'overtone.sc.cgens.io
   'overtone.sc.cgens.buf-io
   'overtone.sc.cgens.env
   'overtone.sc.cgens.tap
   'overtone.sc.cgens.line
   'overtone.sc.cgens.freq
   'overtone.studio.mixer
   'overtone.studio.inst
   'overtone.studio.fx
   'overtone.studio.wavetable
   'overtone.studio.midi
   'overtone.studio.core
   'overtone.music.rhythm
   'overtone.music.pitch
   'overtone.music.tuning
   'overtone.music.time
   'overtone.speech
   'overtone.repl.ugens
   'overtone.repl.examples
   'overtone.repl.shell
   'overtone.repl.inst
   'overtone.repl.debug
   'overtone.libs.asset
   'overtone.libs.event
   'overtone.libs.freesound
   'overtone.version))

(immigrate-overtone-core)

(defonce __PRINT-CONNECT-HELP__
  (when-not (server-connected?)
    (println "--> Please boot a server to start making noise:
    * (boot-server)             ; boot default server (honours config)
    * (boot-internal-server)    ; boot an internal server
    * (boot-external-server)    ; boot an external server
    * (connect-external-server) ; connect to an existing external server
")))
