{:user {:dependencies [[pjstadig/humane-test-output "0.7.1"]]
        :injections [(require 'pjstadig.humane-test-output)
                     (pjstadig.humane-test-output/activate!)]}
 :plugins [[refactor-nrepl "2.2.0"]
           [cider/cider-nrepl "0.11.0"]]}
