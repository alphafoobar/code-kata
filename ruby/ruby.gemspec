# coding: utf-8
lib = File.expand_path('../lib', __FILE__)
$LOAD_PATH.unshift(lib) unless $LOAD_PATH.include?(lib)

Gem::Specification.new do |spec|
    spec.name          = "codekata-ruby"
    spec.version       = "0.0.1"
    spec.authors       = ["alphafoobar"]
    spec.email         = ["developers@everywere.moon"]

    spec.summary       = "Ruby code kata."
    spec.description   = "Ruby code kata."
    spec.homepage      = ""
    spec.license       = "MIT"

    spec.files         = `git ls-files -z`.split("\x0").reject do |f|
        f.match(%r{^(test|spec|features)/})
    end
    spec.bindir        = "exe"
    spec.executables   = spec.files.grep(%r{^exe/}) { |f| File.basename(f) }
    spec.require_paths = ["lib"]

    spec.add_development_dependency "bundler", "~> 1.15"
    spec.add_development_dependency "rake", "~> 10.0"
    spec.add_development_dependency "rspec", "~> 3.0"
    spec.add_development_dependency "pry"
    spec.add_development_dependency "rb-readline"
    spec.add_development_dependency "vcr", "~> 4.0.0"
    spec.add_development_dependency "byebug"

end
