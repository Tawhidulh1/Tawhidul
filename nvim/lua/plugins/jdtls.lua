return {
  "mfussenegger/nvim-jdtls",
  ft = { "java" },
  config = function()
    local project_name = vim.fn.fnamemodify(vim.fn.getcwd(), ":p:h:t")
    local workspace_dir = vim.fn.stdpath("data") .. "/site/java/workspace-root/" .. project_name

    local config = {
      cmd = { "jdtls", "-data", workspace_dir },
      root_dir = require("jdtls.setup").find_root({".git", "mvnw", "gradlew", "pom.xml", "build.gradle"}),
      settings = {
        java = {
          completion = {
            favoriteStaticMembers = {
              "org.springframework.web.bind.annotation.RestController",
              "org.springframework.web.bind.annotation.RequestMapping"
            },
            filteredTypes = {
              "com.sun.*",
              "java.awt.*",
              "jdk.internal.*"
            }
          }
        }
      }
    }

    require("jdtls").start_or_attach(config)
  end,
}

