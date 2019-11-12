# tenki
Weather station developed in Kotlin Native for Raspberry Pi

## How to SSH into a Raspberry Pi

1. **Activate SSH in Raspbian**
<br/>For security reasons, Secure Shell is not turned on by default in Raspbian. On your Raspberry Pi, choose `Menu > Preferences > Raspberry Pi Configuration`. Click on `Interface`s and set `SSH` to **Enabled**. Click **OK**. You don’t need to restart your Raspberry Pi, and SSH will be enabled whenever you use that installation of Raspbian from that point on (be sure to have updated your password from the default, which is ‘raspberry’).
2. **Activate SSH Client in Windows**
<br/>Linux and macOS both support SSH out-of-the-box; skip ahead to Step 3 if you are using one of those operating systems.
Windows 10 supports SSH, but you need to activate it. Click on `Search` and look for `Manage Optional Features`. Click it in Search to open the Settings window.
Click `Add a feature` and wait for the list of `Optional Features` to load. Scroll down the list to `Open SSH Client (Beta)`. Click **Install**.
3. Get your IP address
<br/>Connect your Raspberry Pi to a local network. Use wireless LAN, or connect Raspberry Pi directly to a router with an Ethernet cable. Open a Terminal window and enter the following command: `hostname`
<br/>You should see: `raspberrypi`
<br/>In some circumstances you can use this host name, which is handy if you don’t have the IP address, but it’s more reliable to use the IP (internet protocol) address. 
<br/>Enter this to get your IP address: `hostname -I`
<br/>This will return four numbers separated by dots. For instance, ours is: **192.168.0.41**
<br/>Write this number down. You’ll need it shortly.
4. **Connect via SSH**
<br/>Open Command Prompt on a Windows PC, or a Terminal window in Linux or macOS.
Enter this command: `ssh pi@[IP]`
Replace [IP] with the IP address of the Raspberry Pi. In our case, we enter `ssh pi@192.168.0.41`
The first time you do this, you’ll get a message saying that the authenticity can’t be established, followed by a long cryptographic hash of letters and numbers. It will say, `Are you sure you want to continue connecting?`
Enter **yes** and press RETURN. You’ll be asked to enter the password for your Raspberry Pi.
