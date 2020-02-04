# tenki
Weather station developed in Kotlin Native for Raspberry Pi

## Generate the executable

Compile the project:

```
$ ./gradlew build
```

After a successful build you should be able to see that the binaries are generated under the `build/bin/tenki` folder. In order to test the binary, deploy it on your Pi via SSH, make sure you update the SSH configuration, source folder and destination folder in `build.gradle` with your own configurations:

```
$ ./gradlew deployOnPi
```

> Note: you have to configure the [passwordless SSH access](https://www.raspberrypi.org/documentation/remote-access/ssh/passwordless.md) on your Pi to make the SSH plugin work.
> 
> Follow instructions described bellow: [Go to How to SSH into a Raspberry Pi](#how-to-ssh-into-a-raspberry-pi)

If it's the first time you deploy on your Pi, you need to make sure your `.kexe` file is executable, then execute the binary with `sudo` to test with your circuit:

```
$ chmod 777 tenki-station.kexe
$ sudo ./tenki-station.kexe
```

## How to SSH into a Raspberry Pi

1. **Activate SSH in Raspbian**
<br/>For security reasons, Secure Shell is not turned on by default in Raspbian. On your Raspberry Pi, choose `Menu > Preferences > Raspberry Pi Configuration`. Click on `Interface`s and set `SSH` to **Enabled**. Click **OK**. You don’t need to restart your Raspberry Pi, and SSH will be enabled whenever you use that installation of Raspbian from that point on (be sure to have updated your password from the default, which is ‘raspberry’).
2. **Activate SSH Client in Windows**
<br/>Linux and macOS both support SSH out-of-the-box; skip ahead to Step 3 if you are using one of those operating systems.
Windows 10 supports SSH, but you need to activate it. Click on `Search` and look for `Manage Optional Features`. Click it in Search to open the Settings window.
Click `Add a feature` and wait for the list of `Optional Features` to load. Scroll down the list to `Open SSH Client (Beta)`. Click **Install**.
3. **Get your IP address**
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

## Paswordless SSH access to Raspberry Pi

On the host machine (Windows) open **PowerShell** terminal.
<br/><br/>
Enter the followind commands to generate a new ssh key specific for raspberry pi:
```
> ssh-keygen
> enter the name of the file [raspberry_pi]
> enter password (empty)
> confirm password (empty)
```
Check if the ssh agent is running:
```
> Get-Service ssh-agent
Status   Name               DisplayName
------   ----               -----------
Stopped  ssh-agent          OpenSSH Authentication Agent
```
*If the status is `Running` you can skip to the final step (adding the ssh to the agent)*
<br/><br/>Check the start type for the ssh agent:
```
> Get-Service ssh-agent | Select StartType
StartType
---------
Disabled
```
Change the startup type to `Manual` or `Automatic` and check the status afterwards:
```
> Get-Service -Name ssh-agent | Set-Service -StartupType Manual
> ssh-agent
> Get-Service ssh-agent
Status   Name               DisplayName
------   ----               -----------
Running  ssh-agent          OpenSSH Authentication Agent
```
Add the ssh to the agent:
```
> ssh-add ~\.ssh\raspberry_pi
```
Make sure ./ssh folder is available on raspberry pi:
```
> ssh pi@192.168.0.41 mkdir ~/.ssh
```
Exit from raspberry pi (only if previous command was run)
```
> exit 
```
Copy public key to raspberry pi:
```
> scp raspberry_pi.pub pi@192.168.0.41:~\.ssh\authorized_keys
```
Test it out(should login without password):
```
> ssh pi@192.168.0.41
```
Copy file from raspberry pi host machine:
```
> scp pi@192.168.1.112:[path_to_file] .
```
