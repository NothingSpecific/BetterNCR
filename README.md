# BetterNCR
A better plugin to block chat reports.

It's like No Chat Reports, but better! This plugin is written to work with EssentialsX without causing issues. If this plugin causes issues when paired with EssentialsX, please submit a bug report.

EssentialsX has been warning server admins who try to install No Chat Reports and Essentials on the same server. Originally they tried to claim it was simple incompatibility, but in their code they [moved No Chat Reports from `serverUnsupportedDangerous` to `serverUnsupportedDumb`](https://github.com/EssentialsX/Essentials/blob/0936fe80bd7426b0e002485163d026d5134d0c65/Essentials/src/main/java/com/earth2me/essentials/commands/Commandessentials.java#L796) ([SupportStatus.STUPID_PLUGIN](https://github.com/EssentialsX/Essentials/blob/bf14b88600601019fb51dd6e6a1524e411e9b339/Essentials/src/main/java/com/earth2me/essentials/utils/VersionUtil.java#L66)). I took this as an admission that compatibility was never their concern.

**It's your server, you should be able to disable Draconian features like chat reporting.** The developers of a completely unrelated plugin shouldn't be able to tell you what plugins to use.

Since this plugin is specifically designed to work with EssentialsX (as well as any other chat-handling plugins), this should remove any credibility from attempts to issue warnings upon detection of this plugin's presence. I can't guarantee they won't try to do the same thing to this plugin, but if they do there's no way to legitimize the decision.

---

If you want an Essentials replacement that won't decide on your behalf what plugins you're allowed on your server, I'm working on a from-scratch reimplementation that aims to respect the pricipals of libre software. My reimplementation will have the same functionality built-in and enabled by default, although you will be able to opt into chat reporting on your server if you really want to.

---

### Why should I disable chat reporting?

Mojang's chat reporting is a controversial feature, and while there are certain prominent figures who don't understand the controversy, there are legitimate concerns with it.

Take [MCBans](https://www.mcbans.com/#), for example, which is an opt-in global banning system which allows servers to opt into global bans and even adds failsafes to only ban players after they've received a specific configurable number of bans from individual servers.

Compare that to Mojang's chat reporting, which global bans players potentially after only a single incident, has no configurability for what types of number of offenses should be global-bannable, and relies on trust in a centalized organization (Microsoft) with little to no transparency or accountability to their own users.

### But haven't the vulnerabilities been fixed?

No, they haven't... Or at least not all of them. Some of the chat reporting vulnerabilities have been fixed, but some remain. If you're interested in learning more, watch Aizistral's video [Chat Reporting in Minecraft 1.19.3: The End of Blockchain Chat](https://www.youtube.com/watch?v=48H5nMQ_8Yg).

It's also worth considering that the vulnerabilities are significant concerns with Mojang's chat reporting, but they're not the fundamental issues with it. The fundamental issue is with the need to trust a centralized unaccountable organization to make these moderation decisions instead of relying on a server's own moderators to decide what's appropriate for their server.

### But chat reporting is actually good, and disabling it is stupid!

Then you can choose not to use this plugin. I disagree and highly recommend you watch Aizistral's video [Why defenders of Minecraft's chat reporting are WRONG](https://www.youtube.com/watch?v=bF_37BrWBSM). But it's your server which means it's your decision whether to enable or disable chat reporting.

---

## Building

This project is developed using Eclipse Java. Since the classpath contains system-specific file paths, I created an `init.py` script that rewrites system-specific classpath information.

Before opening this project in Eclipse, you should make sure to run `init.py`. After asking you for the location of your Spigot shaded API JAR file, it will automatically fix the project's classpath to work on your system.

*Note: This plugin is licensed under the [GNU AGPL 3.0 license](https://www.gnu.org/licenses/agpl-3.0.en.html), but can also be licensed under [BSD 3-clause](https://opensource.org/license/BSD-3-clause/) upon request. For anyone considering contributing to this project, please understand that your contributions may be distributed under [AGPLv3](https://www.gnu.org/licenses/agpl-3.0.en.html) or [BSD 3-clause](https://opensource.org/license/BSD-3-clause/).*
