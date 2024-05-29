const { defineConfig } = require("cypress");
const preprocessor = require("@badeball/cypress-cucumber-preprocessor");
const browserify = require("@badeball/cypress-cucumber-preprocessor/browserify");

async function setupNodeEvents(cypressOn, config) {
  // implement node event listeners here
  const on = require("cypress-on-fix")(cypressOn)
  await preprocessor.addCucumberPreprocessorPlugin(on, config);
  on("file:preprocessor", browserify.default(config));
  require("cypress-mochawesome-reporter/plugin")(on);
  return config
}

module.exports = defineConfig({
  projectId: 'dqgtfx',
  defaultCommandTimeout: 6000,
  env: {
    url: "https://rahulshettyacademy.com"
  },
  retries: {
    runMode: 1
  },
  reporter: "cypress-mochawesome-reporter",
  e2e: {
    setupNodeEvents,
    specPattern: "cypress/integration/examples/BDD/*.feature"
    // specPattern: "cypress/integration/*/*.js"
  },
});
