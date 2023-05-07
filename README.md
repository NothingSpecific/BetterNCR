# BetterNCR
A better plugin to block chat reports

It's like No Chat Reports, but better! This plugin is written to work with EssentialsX without causing issues. If this plugin causes issues when paired with EssentialsX, please submit a bug report.

EssentialsX has been warning server admins who try to install No Chat Reports and Essentials on the same server. Originally they tried to claim it was simple incompatibility, but in their code they [moved No Chat Reports from `serverUnsupportedDangerous` to `serverUnsupportedDumb`](https://github.com/EssentialsX/Essentials/blob/0936fe80bd7426b0e002485163d026d5134d0c65/Essentials/src/main/java/com/earth2me/essentials/commands/Commandessentials.java#L796) ([SupportStatus.STUPID_PLUGIN](https://github.com/EssentialsX/Essentials/blob/bf14b88600601019fb51dd6e6a1524e411e9b339/Essentials/src/main/java/com/earth2me/essentials/utils/VersionUtil.java#L66)). I took this as an admission that compatibility was never their concern.

**It's your server, you should be able to disable Draconian features like chat reporting.** The developers of a completely unrelated plugin shouldn't be able to tell you what plugins to use.

Since this plugin is specifically designed to work with EssentialsX (as well as any other chat-handling plugins), this should remove any credibility from attempts to issue warnings upon detection of this plugin's presence. I can't guarantee they won't try to do the same thing to this plugin, but if they do there's no way to legitimize the decision.

---
If you want an Essentials replacement that won't decide on your behalf what plugins you're allowed on your server, I'm working on a from-scratch reimplementation that aims to respect the pricipals of libre software. My reimplementation will have the same functionality built-in and enabled by default, although you will be able to opt into chat reporting on your server if you really want to.


*Note: This plugin is licensed under the GNU AGPL 3.0 license, but can also be licensed under BSD 3-clause upon request. For anyone considering contributing to this project, please understand that your contributions may be distributed under AGPLv3 or BSD 3-clause.*
